package com.example.android.padc_gallery;

import android.app.Application;
import android.content.Context;

/**
 * Created by nawthuellay on 28/06/2016.
 */
public class PADC_GalleryApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this.getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
