package com.bhgconcepts.myrestaurant;

import android.app.Application;

import com.urbanairship.UAirship;

/**
 * Created by briangrant on 1/11/17.
 */

public class myRestaurantsApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        UAirship.takeOff(this, new UAirship.OnReadyCallback() {
            @Override
            public void onAirshipReady(UAirship airship) {

                // Enable user notifications
            }
        });
        UAirship.shared().getPushManager().setUserNotificationsEnabled(true);

    }
}
