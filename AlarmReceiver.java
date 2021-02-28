package com.example.mehdi.alarm1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by Mehdi on 16.04.2018.
 */

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Günaydın, kakma vakti", Toast.LENGTH_LONG).show();

        Uri alarmMelodisi = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        //Varsayılan melodi
        if (alarmMelodisi == null)
        {
            alarmMelodisi = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, alarmMelodisi);
        ringtone.play();
    }
}
