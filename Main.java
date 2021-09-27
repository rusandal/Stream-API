import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> integerList = new ArrayList<>();
        int i=0;
        for (Integer value : intList)
        {
            if (value>0 & value % 2 == 0) {
                integerList.add(i,value);
                i++;
            }
        }
        Collections.sort(integerList);
        System.out.println(integerList.toString());
    }
}
