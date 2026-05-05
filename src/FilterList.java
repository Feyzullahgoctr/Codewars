

import java.util.ArrayList;
import java.util.List;

public class FilterList {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out

        List<Object> result = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Integer) {
                result.add(obj);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Object> list = filterList(List.of(1, 2, "a", "b"));

        for (Object l : list) {
            System.out.println(l);

        }

    }

}
