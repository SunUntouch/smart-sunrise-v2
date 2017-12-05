package de.sununtouch.smartsunrise.Model.Music;

import android.provider.Settings;

import de.sununtouch.smartsunrise.Model.AbstractModel;

/**
 * Created by Sunny on 04.12.2017.
 */

public class SongModel extends AbstractModel{

    //Music
    private String m_SongURI        = Settings.System.DEFAULT_ALARM_ALERT_URI.getPath(); //todo use Android Ringtone
    private int m_SongStart         = 0;
    private int m_SongLength        = 0;


}
