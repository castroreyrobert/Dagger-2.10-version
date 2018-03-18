package com.example.myapplication.components;

import android.app.Application;

import com.example.myapplication.ActivityBuilder;
import com.example.myapplication.MyApplication;
import com.example.myapplication.modules.ApplicationModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by castroreyrobert on 3/17/18.
 */

@Component(modules = {AndroidSupportInjectionModule.class, ApplicationModule.class, ActivityBuilder.class})

public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        ApplicationComponent build();
    }

    void inject(MyApplication myApplication);
}
