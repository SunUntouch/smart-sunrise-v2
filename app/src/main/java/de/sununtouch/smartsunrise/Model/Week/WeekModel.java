package de.sununtouch.smartsunrise.Model.Week;

import org.json.JSONObject;

import de.sununtouch.smartsunrise.Model.AbstractModel;

/**
 * Created by Sunny on 03.12.2017.
 */

public class WeekModel extends AbstractModel{

    private DayModel m_Monday       = new DayModel();
    private DayModel m_TuesdaySet   = new DayModel();
    private DayModel m_WednesdaySet = new DayModel();
    private DayModel m_ThursdaySet  = new DayModel();
    private DayModel m_FridaySet    = new DayModel();
    private DayModel m_SaturdaySet  = new DayModel();
    private DayModel m_SundaySet    = new DayModel();

    public String asJSONString(){
        return new String();
    }

    public JSONObject asJSONObject(){
        return new JSONObject();
    }
}
