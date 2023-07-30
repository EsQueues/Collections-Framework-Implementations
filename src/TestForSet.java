import javax.naming.PartialResultException;
import java.sql.Array;
import java.util.*;

public class TestForSet {
    public static void main(String[] args) {
        //реализован на основе map
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        testSet(hashSet);

//        testSet(linkedHashSet);

//        testSet(treeSet);
    }
    public static void testSet(Set<String> set){
        set.add("Zuli");
        set.add("Lola");
        set.add("Opener");
        set.add("Nomad");
        set.add("Adam");
        for(String i:set){
            System.out.println(i);
        }
    }
}
