package com.xmartlabs.template.ui;

import com.xmartlabs.template.BuildConfig;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by santiago on 02/02/16.
 */
// Set the package name: https://github.com/robolectric/robolectric/issues/2110
@Config(constants = BuildConfig.class, packageName = "com.xmartlabs.template", sdk = 21)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
  // With SNAPSHOT and sdk 23 it doesn't work: https://github.com/robolectric/robolectric/issues/1932
  // With 3.0 and sdk 21, there are issues with Google Play 8.3 and 8.4: https://github.com/robolectric/robolectric/issues/2215
  @Ignore
  @Test
  public void checkTitle() {
    MainActivity activity = Robolectric.setupActivity(MainActivity.class);
    Assert.assertThat(activity.getTitle().toString(), containsString("Base project"));
  }
}
