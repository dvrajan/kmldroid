package local.deva.kmldroid.model.feature.overlay;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewVolume {
    private double leftFov;
    private double rightFov;
    private double bottomFov;
    private double topFov;
    private double near;
}
