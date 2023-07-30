import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(-1);
        Collections.sort(list,
                (o1,o2)->{
            if(o1>o2) return 1;
            else if(o2>o1) return -1;
            else return 0;
                });
        System.out.println(list);
    }


}
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
