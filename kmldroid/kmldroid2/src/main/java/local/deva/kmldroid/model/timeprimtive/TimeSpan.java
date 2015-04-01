package local.deva.kmldroid.model.timeprimtive;

import java.util.Date;

/**
 * Created by Ram on 4/1/2015.
 */

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class TimeSpan extends TimePrimitive {
    private Date begin;
    private Date end;
}
