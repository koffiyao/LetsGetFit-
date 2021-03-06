package com.ykeocorp.letsgetfit;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.ykeocorp.letsgetfit.Workout_Java.WorkoutActivity;

import static android.R.id.message;

/**
 * Created by Ama on 4/18/2017.
 */

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Switch s;
        final View v;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        v = this.findViewById(android.R.id.content);

        s = (Switch) findViewById(R.id.notificationSwitch);
        //s.setChecked(true);
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    sendNotification(v);
            }
        });
    }

    public void sendNotification(View view) {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this);

//        NotificationManager notificationManager = (NotificationManager) this
//                .getSystemService(Context.NOTIFICATION_SERVICE);
//        Notification notification = new Notification();

        //Create the intent that’ll fire when the user taps the notification//
        Intent intent = new Intent(this, WorkoutActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

//        notification.flags |= Notification.FLAG_AUTO_CANCEL;
//        notificationManager.notify(0, notification);

        mBuilder.setContentIntent(pendingIntent);

        mBuilder.setSmallIcon(R.drawable.notification_icon);
        mBuilder.setContentTitle("Let's Get Fit!");
        mBuilder.setContentText("Time for Your Work Out!");

        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(001, mBuilder.build());
    }

}
