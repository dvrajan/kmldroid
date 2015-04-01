package local.deva.kmldroid.model.ListStyle;

/**
 * Created by Ram on 4/1/2015.
 */
import android.graphics.Color;

import java.net.URI;

import local.deva.kmldroid.model.*;
import local.deva.kmldroid.model.enums.ListItemType;
import local.deva.kmldroid.model.enums.State;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ListStyle extends local.deva.kmldroid.model.Object {
    private ListItemType listItemType;
    private URI href;
    private Color bgColor;
    private State state;
    private ItemIcon itemIcon;
}
