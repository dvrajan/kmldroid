package local.deva.kmldroid.model.abstractview;

import local.deva.kmldroid.model.enums.AltitudeMode;

/**
 * Created by Ram on 4/1/2015.
 */

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Camera extends AbstractView {
    private double latitude;
    private double longitude;
    private double altitude;
    private double heading;
    private double tilt;
    private double roll;
    private AltitudeMode altitudeMode;
}
