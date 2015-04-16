package local.deva.kmldroid.model.feature;

/**
 * Created by Ram on 4/1/2015.
 */
import local.deva.kmldroid.model.atom.Link;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class NetworkLink extends Feature {
    private Link link;
    private Boolean refreshVisibility;
    private Boolean flyToView;
}
