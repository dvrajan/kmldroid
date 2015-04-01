package local.deva.kmldroid.model.feature.container;

import java.net.URI;
import java.net.URL;
import java.util.List;


import local.deva.kmldroid.model.feature.Feature;
import local.deva.kmldroid.model.styleselector.StyleSelector;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

/**
 * Created by Ram on 4/1/2015.
 */
public class Document extends Container{

    private List<StyleSelector> styleSelectorList;
    private List<Schema> schemaList;
    private List<Feature> featureList;
}
