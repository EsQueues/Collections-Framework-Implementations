import java.security.KeyStore;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestForMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        Map<Integer,String> treeMap=new TreeMap<>();

        testMethod(hashMap);
     // не упорядоченная так как зависит от хеш функий


       // testMethod(linkedHashMap);
// упорядоченная порядок по добавление элементов


        // testMethod(treeMap);
// упорядоченная порядок по 'natural ordering'. default 1->2->3  по возрастанию

    }

    public static void testMethod(Map<Integer,String> map){
        map.put(21,"Zhanna");
        map.put(3,"Berdibek");
        map.put(17,"Sayat");
        map.put(7,"Bigeldi");
        map.put(15,"Nurgisa");
        map.put(49,"Sailau");
        map.put(44,"Almash");
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
