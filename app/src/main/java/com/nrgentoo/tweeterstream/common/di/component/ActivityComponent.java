package com.nrgentoo.tweeterstream.common.di.component;

import com.nrgentoo.tweeterstream.common.di.PerActivity;
import com.nrgentoo.tweeterstream.common.di.module.ActivityModule;
import com.nrgentoo.tweeterstream.view.LoginActivity;
import com.nrgentoo.tweeterstream.view.abstracttimeline.AbstractPresenter;
import com.nrgentoo.tweeterstream.view.hometimeline.HomeTimelinePresenter;
import com.nrgentoo.tweeterstream.view.main.MainActivity;

import dagger.Component;

/**
 * Activity Component
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(HomeTimelinePresenter timelinePresenter);

    void inject(AbstractPresenter abstractPresenter);
}
