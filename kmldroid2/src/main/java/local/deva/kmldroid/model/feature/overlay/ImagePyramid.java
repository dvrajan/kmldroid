package local.deva.kmldroid.model.feature.overlay;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImagePyramid {
    private int tileSize;
    private int maxWidth;
    private int maxHeight;
    private GridOrigin gridOrigin;

    public enum GridOrigin{
            LOWER_LEFT, UPPER_RIGHT
    }
}
