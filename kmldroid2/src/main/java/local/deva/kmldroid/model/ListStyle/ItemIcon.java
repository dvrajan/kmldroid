package local.deva.kmldroid.model.ListStyle;

/**
 * Created by Ram on 4/1/2015.
 */
import local.deva.kmldroid.model.enums.ListItemType;
import local.deva.kmldroid.model.feature.overlay.Icon;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ItemIcon {
    private Icon icon;
    private ListItemType listItemType;
}
