package de.sununtouch.smartsunrise.Model.Light;

import android.arch.persistence.room.Embedded;

import de.sununtouch.smartsunrise.Model.AbstractModel;

/**
 * Model which represents the data of the different Light Modes
 */

public class LightModel extends AbstractModel{

    @Embedded
    private ScreenModel screen;

    @Embedded
    private LEDModel led;
}
