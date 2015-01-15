package com.github.lexer.segmentandroidsample;

import android.app.Application;

import com.segment.analytics.Analytics;

/**
 * Created by zakharov on 1/13/15.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Analytics.with(this).track("app_launched");
    }
}
