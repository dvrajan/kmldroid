package local.deva.kmldroid.model.SubStyle.colorStyle;

import android.graphics.Color;

import local.deva.kmldroid.model.enums.DisplayMode;

/**
 * Created by Ram on 4/1/2015.
 */
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BalloonStyle extends ColorStyle {
    private Color bgColor;
    private Color textColor;
    private String text;
    private DisplayMode displaymode;
}
