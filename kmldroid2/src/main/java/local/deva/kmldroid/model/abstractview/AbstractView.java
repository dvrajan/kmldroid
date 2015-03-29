package local.deva.kmldroid.model.abstractview;


import java.util.List;

import local.deva.kmldroid.model.*;
import local.deva.kmldroid.model.gx.ViewerOption;
import local.deva.kmldroid.model.timeprimtive.TimePrimitive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractView extends local.deva.kmldroid.model.Object{
    private TimePrimitive timePrimitive;
    private List<ViewerOption> viewerOptions;
}
