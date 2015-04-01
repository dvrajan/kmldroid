package local.deva.kmldroid.model.atom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Link {
    private String href;
    private String type;
    private String rel;
    private String title;
}
