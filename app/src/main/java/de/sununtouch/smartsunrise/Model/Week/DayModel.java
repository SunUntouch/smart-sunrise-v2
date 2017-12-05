package de.sununtouch.smartsunrise.Model.Week;

import org.json.JSONObject;

import de.sununtouch.smartsunrise.Model.AbstractModel;

/**
 * Created by Sunny on 03.12.2017.
 */

public class DayModel extends AbstractModel{

    //Time
    private int m_Hour       = 0;
    private int m_Minutes    = 0;

    private int m_SnoozeTime = 5;

    private boolean m_isSet = false;

    private boolean m_UniqueTime = false;

    public String asJSONString(){
        return new String();
    }

    public JSONObject asJSONObject(){
        return new JSONObject();
    }
}
