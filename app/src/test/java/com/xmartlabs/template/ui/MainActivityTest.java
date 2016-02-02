package com.xmartlabs.template.ui;

import com.xmartlabs.template.BuildConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by santiago on 02/02/16.
 */
@Config(constants = BuildConfig.class, packageName="com.xmartlabs.template")
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
  @Test
  public void checkTitle() {
    MainActivity activity = Robolectric.setupActivity(MainActivity.class);
    Assert.assertThat(activity.getTitle().toString(), containsString("Repositories"));
  }
}
