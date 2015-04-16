package local.deva.kmldroid.model.Geometry;

/**
 * Created by Ram on 4/1/2015.
 */
import local.deva.kmldroid.model.enums.AltitudeMode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Polygon extends Geometry {
    private boolean extrude;
    private boolean tesselate;
    private AltitudeMode altitudeMode;
    private LinearRing outerBoundaryLs;
    private LinearRing innerBoundaryLs;
}
