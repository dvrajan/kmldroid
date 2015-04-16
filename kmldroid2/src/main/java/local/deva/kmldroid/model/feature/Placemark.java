package local.deva.kmldroid.model.feature;

/**
 * Created by Ram on 4/1/2015.
 */
import local.deva.kmldroid.model.Geometry.Geometry;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Placemark extends Feature {
    private Geometry geometry;

}
