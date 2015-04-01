package local.deva.kmldroid.model.feature.overlay;

import local.deva.kmldroid.model.LatLonAltBox;
import local.deva.kmldroid.model.enums.AltitudeMode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
/**
 * Created by Ram on 4/1/2015.
 */
public class GroundOverlay {
    private float altitude;
    private AltitudeMode altitude_mode;
    private LatLonAltBox latlonaltbox;
}
