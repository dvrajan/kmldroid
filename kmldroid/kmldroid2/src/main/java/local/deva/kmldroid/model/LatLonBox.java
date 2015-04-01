package local.deva.kmldroid.model;

/**
 * Created by Ram on 4/1/2015.
 */

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LatLonBox {
    private double north;
    private double south;
    private double east;
    private double west;
    private double rotation;
}
