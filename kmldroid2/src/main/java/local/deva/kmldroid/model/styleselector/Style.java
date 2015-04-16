package local.deva.kmldroid.model.styleselector;

/**
 * Created by Ram on 4/1/2015.
 */
import java.net.URI;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Style extends StyleSelector {
    private String styleId;
    private URI styleUrl;
}
