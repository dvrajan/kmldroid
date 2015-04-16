package local.deva.kmldroid.model.Geometry;

import local.deva.kmldroid.model.Coordinates;
import local.deva.kmldroid.model.enums.AltitudeMode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
/**
 * Created by Ram on 4/1/2015.
 */
public class LineString extends Geometry {
    private boolean extrude;
    private boolean tesselate;
    private AltitudeMode altitudeMode;
    private Coordinates coordinates;
}
