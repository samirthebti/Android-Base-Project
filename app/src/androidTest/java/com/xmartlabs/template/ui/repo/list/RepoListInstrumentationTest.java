package com.xmartlabs.template.ui.repo.list;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xmartlabs.template.R;
import com.xmartlabs.template.ui.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;

/**
 * Created by santiago on 21/03/16.
 */
@RunWith(AndroidJUnit4.class)
public class RepoListInstrumentationTest {
  @Rule
  public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

  @Before
  public void setUp() {
    onView(withId(R.id.activity_main_layout)).perform(DrawerActions.open());
    onView(withText(R.string.repo_list_title)).perform(click());
  }

  @Test
  public void checkRepoListNotEmpty() {
    onView(withId(R.id.repos_recyclerView)).check((view, noViewFoundException) -> {
      RecyclerView recyclerView = (RecyclerView) view;
      assertThat(recyclerView.getAdapter().getItemCount(), is(0));
    });
  }
}
