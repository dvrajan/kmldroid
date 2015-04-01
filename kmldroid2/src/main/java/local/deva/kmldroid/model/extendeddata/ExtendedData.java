package local.deva.kmldroid.model.extendeddata;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtendedData {
    private List<Data> dataList;
    private List<SchemaData> schemaDataList;
}
