import java.util.ArrayList;
import java.util.List;

public class Flattener {

    // Not sure this is the best way to solve this
    // feels like I shouldn't be using `Object`
   public List<Object> flatten(List<Object> data) {

        var flatData = new ArrayList<Object>();

        for (var item : data) {

            if (item instanceof List) {

                var subList = (List<Object>) item;
                flatData.addAll(flatten(subList));
            } else {

                if (item != null) {
                    flatData.add(item);
                }
            }
        }

       return flatData;
   }
}
