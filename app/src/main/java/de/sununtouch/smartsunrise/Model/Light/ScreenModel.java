package de.sununtouch.smartsunrise.Model.Light;

import android.graphics.Color;

import de.sununtouch.smartsunrise.Model.AbstractModel;

/**
 * Model which represents the data of the Screen Mode
 */

public class ScreenModel extends AbstractModel {

    private boolean isSet  = true;
    private int brightness = 100;
    private int startTime  = 30;
    private int startTemp  = 0;
    private int color1     = Color.RED;
    private int color2     = Color.BLUE;
    private boolean fading = true;
}
