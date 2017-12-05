package de.sununtouch.smartsunrise.Model.Music;

import android.arch.persistence.room.Embedded;

import de.sununtouch.smartsunrise.Model.AbstractModel;

/**
 * Created by Sunny on 03.12.2017.
 */

public class MusicModel extends AbstractModel{

    @Embedded
    private SongModel song;

    private int volume            = 100;

    private boolean fade     = false;
    private int fadeTime        = 0;

    private boolean vibration  = false;
    private int m_VibrationStrength = 0;

}
