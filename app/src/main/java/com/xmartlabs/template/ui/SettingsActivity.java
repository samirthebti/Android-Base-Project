package com.xmartlabs.template.ui;

import android.support.annotation.NonNull;

import com.f2prateek.dart.HensonNavigable;

/**
 * Created by santiago on 10/09/15.
 */
@HensonNavigable
public class SettingsActivity extends SingleFragmentWithToolbarActivity {
  @NonNull
  @Override
  protected BaseFragment createFragment() {
    return new SettingsFragmentBuilder().build();
  }

  @Override
  protected boolean showNavigationIcon() {
    return true;
  }
}
