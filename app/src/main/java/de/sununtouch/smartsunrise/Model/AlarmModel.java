package de.sununtouch.smartsunrise.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.content.Context;

import de.sununtouch.smartsunrise.Model.Light.LightModel;
import de.sununtouch.smartsunrise.Model.Music.MusicModel;
import de.sununtouch.smartsunrise.Model.Week.WeekModel;

/**
 * Created by Sunny on 03.12.2017.
 */
@Entity
public class AlarmModel extends AbstractModel{

    @Ignore
    private Context m_Context;

    //Actual Alarm Values
    @PrimaryKey
    @ColumnInfo(name = "alarmId")
    private int id;

    private String name = "Alarm";

    //Actual Alarm Set
    private boolean isSet = false;
    private boolean tempTimes    = false;
    private boolean alarmOneShot = false;

    private long m_AlarmTimeMillis = Long.MAX_VALUE;

    private boolean dirty = false;
    private boolean initial = true;

    //Days
    @Embedded
    private WeekModel days;

    //Music
    @Embedded
    private MusicModel music;

    //Light
    @Embedded
    private LightModel light;
}
