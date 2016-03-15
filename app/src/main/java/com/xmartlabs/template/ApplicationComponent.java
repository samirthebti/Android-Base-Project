package com.xmartlabs.template;

import com.xmartlabs.template.controller.AuthController;
import com.xmartlabs.template.controller.Controller;
import com.xmartlabs.template.controller.RepoController;
import com.xmartlabs.template.controller.ServiceController;
import com.xmartlabs.template.controller.SessionController;
import com.xmartlabs.template.helper.DatabaseHelper;
import com.xmartlabs.template.helper.GeneralErrorHelper;
import com.xmartlabs.template.module.AndroidModule;
import com.xmartlabs.template.module.ControllerModule;
import com.xmartlabs.template.module.DatabaseModule;
import com.xmartlabs.template.module.GeneralErrorHelperModule;
import com.xmartlabs.template.module.GsonModule;
import com.xmartlabs.template.module.OkHttpModule;
import com.xmartlabs.template.module.PicassoModule;
import com.xmartlabs.template.module.ReceiverModule;
import com.xmartlabs.template.module.RestServiceModule;
import com.xmartlabs.template.module.SessionInterceptor;
import com.xmartlabs.template.ui.BaseActivity;
import com.xmartlabs.template.ui.BaseAppCompatActivity;
import com.xmartlabs.template.ui.BaseFragment;
import com.xmartlabs.template.ui.FragmentWithDrawer;
import com.xmartlabs.template.ui.HomeFragment;
import com.xmartlabs.template.ui.MainActivity;
import com.xmartlabs.template.ui.SettingsActivity;
import com.xmartlabs.template.ui.SettingsFragment;
import com.xmartlabs.template.ui.SingleFragmentActivity;
import com.xmartlabs.template.ui.StartActivity;
import com.xmartlabs.template.ui.ValidatableFragment;
import com.xmartlabs.template.ui.WelcomeActivity;
import com.xmartlabs.template.ui.WelcomeFragment;
import com.xmartlabs.template.ui.repo.list.RepoListAdapter;
import com.xmartlabs.template.ui.repo.detail.RepoDetailActivity;
import com.xmartlabs.template.ui.repo.detail.RepoDetailFragment;
import com.xmartlabs.template.ui.repo.list.RepoListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by santiago on 06/10/15.
 */
@Singleton
@Component(modules = {
    AndroidModule.class,
    ControllerModule.class,
    DatabaseModule.class,
    GeneralErrorHelperModule.class,
    GsonModule.class,
    OkHttpModule.class,
    PicassoModule.class,
    ReceiverModule.class,
    RestServiceModule.class,
})
public interface ApplicationComponent {
  void inject(BaseActivity baseActivity);
  void inject(BaseAppCompatActivity baseAppCompatActivity);
  void inject(SingleFragmentActivity singleFragmentActivity);

  void inject(MainActivity mainActivity);
  void inject(RepoDetailActivity repoDetailActivity);
  void inject(StartActivity startActivity);
  void inject(SettingsActivity settingsActivity);
  void inject(WelcomeActivity welcomeActivity);

  void inject(BaseFragment baseFragment);
  void inject(FragmentWithDrawer fragmentWithDrawer);
  void inject(ValidatableFragment validatableFragment);

  void inject(HomeFragment homeFragment);
  void inject(RepoDetailFragment repoDetailFragment);
  void inject(RepoListFragment repoListFragment);
  void inject(SettingsFragment settingsFragment);
  void inject(WelcomeFragment welcomeFragment);

  void inject(RepoListAdapter repoListAdapter);

  void inject(Controller controller);
  void inject(ServiceController serviceController);

  void inject(AuthController authController);
  void inject(RepoController repoController);
  void inject(SessionController sessionController);

  void inject(SessionInterceptor sessionInterceptor);

  void inject(DatabaseHelper databaseHelper);
  void inject(GeneralErrorHelper generalErrorHelper);
}
