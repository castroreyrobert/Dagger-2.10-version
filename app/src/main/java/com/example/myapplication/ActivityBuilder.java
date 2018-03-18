package com.example.myapplication;

import android.app.Activity;

import com.example.myapplication.components.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by castroreyrobert on 3/17/18.
 */

@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);
}
