package com.example.myapplication.modules;

import android.app.Application;
import android.content.Context;

import com.example.myapplication.MainActivity;
import com.example.myapplication.components.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by castroreyrobert on 3/17/18.
 */
@Module(subcomponents = MainActivityComponent.class)
public class ApplicationModule {

    @Provides
    @Singleton
    Context provideAppContext(Application application){
        return application;
    }
}
