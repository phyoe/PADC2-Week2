package xyz.phyoekhant.padc_week2;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Phyoe Khant on 6/13/17.
 */
public class MyApp extends Application {

    public static String TAG = "MyApp";

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
