package local.deva.kmldroid.model.feature.overlay;


import android.graphics.Color;

import local.deva.kmldroid.model.feature.Feature;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Overlay extends Feature{
    private Color color;
    private int drawOrder;
    private Icon icon;
}
