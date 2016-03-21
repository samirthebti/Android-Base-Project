package com.xmartlabs.template.ui;

import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.Toolbar;

import com.xmartlabs.template.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by santiago on 03/02/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentationTest {
  @Rule
  public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

  @Test
  public void checkTitleWhenStartingApp() {
    onView(withId(R.id.toolbar)).check(matches(withToolbarTitle(containsString("Home"))));
  }

  private static Matcher<Object> withToolbarTitle(final Matcher<String> textMatcher) {
    return new BoundedMatcher<Object, Toolbar>(Toolbar.class) {
      @Override
      public boolean matchesSafely(Toolbar toolbar) {
        return textMatcher.matches(toolbar.getTitle());
      }

      @Override
      public void describeTo(Description description) {
        description.appendText("with toolbar title: ");
        textMatcher.describeTo(description);
      }
    };
  }
}
