package local.deva.kmldroid.model.SubStyle.colorStyle;

import android.graphics.Color;

import local.deva.kmldroid.model.*;
import local.deva.kmldroid.model.enums.ColorMode;

/**
 * Created by Ram on 4/1/2015.
 */
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ColorStyle extends local.deva.kmldroid.model.Object {
    private Color color;
    private ColorMode colorMode;
}
