package local.deva.kmldroid.model.extendeddata;


import android.net.Uri;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchemaData {
    private Uri schemaUrl;
    private List<SimpleData> simpleDataList;
}
