package local.deva.kmldroid.model.abstractview;

import local.deva.kmldroid.model.enums.AltitudeMode;

/**
 * Created by Ram on 4/1/2015.
 */

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LookAt extends AbstractView {
    private double latitude;
    private double longitude;
    private double altitude;
    private double heading;
    private double tilt;
    private double range;
    private AltitudeMode altitudeMode;
}
