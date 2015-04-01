package local.deva.kmldroid.model.feature.container;

import java.net.URI;
import java.net.URL;

import javax.xml.validation.Schema;

import local.deva.kmldroid.model.styleselector.StyleSelector;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

/**
 * Created by Ram on 4/1/2015.
 */
public class Document extends Container{

    private StyleSelector styleSelector;
    private Schema schema;
}
