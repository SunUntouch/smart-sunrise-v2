package de.sununtouch.smartsunrise.Model;

import org.json.JSONObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Sunny on 03.12.2017.
 */

public class Model extends AbstractModel {

    private static Model m_Instance;

    private final List<AlarmModel> m_Alarms;

    private Model(){
        m_Alarms = new Vector<>();
    }

    public static Model getInstance(){
        if(m_Instance == null)
            m_Instance = new Model();
        return  m_Instance;
    }

    public String asJSONString(){
         return new String();
    }

    public JSONObject asJSONObject(){
        return new JSONObject();
    }
}
