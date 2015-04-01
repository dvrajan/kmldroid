package local.deva.kmldroid.model.Geometry;

/**
 * Created by Ram on 4/1/2015.
 */
import local.deva.kmldroid.model.coordinates.Coordinates;
import local.deva.kmldroid.model.enums.AltitudeMode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Point extends Geometry {
    private boolean extrude;
    private AltitudeMode altitudeMode;
    private Coordinates coordinates;
}
