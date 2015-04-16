package local.deva.kmldroid.model.SubStyle.colorStyle;

/**
 * Created by Ram on 4/1/2015.
 */
import local.deva.kmldroid.model.Icon;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class IconStyle extends ColorStyle {
    private double scale;
    private double heading;
    private Icon icon;
    private HotSpot hotSpot;


}
