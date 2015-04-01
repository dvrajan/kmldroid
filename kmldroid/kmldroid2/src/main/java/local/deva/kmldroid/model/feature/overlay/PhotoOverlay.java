package local.deva.kmldroid.model.feature.overlay;


import android.graphics.Point;

import local.deva.kmldroid.model.enums.Shape;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhotoOverlay {
    private float rotation;
    private ViewVolume viewVolume;
    private ImagePyramid imagePyramid;
    private Point point;
    private Shape shape;
}
