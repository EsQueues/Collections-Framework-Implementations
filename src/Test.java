import java.util.*;

public class Test  {
    public static void main(String[] args) {
//        MyArrayList<Integer> list=new MyArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(9);
//        list.add(3);
//        list.add(0,99);
//        list.add(1,18);
//        list.add(6,0);
//        System.out.println(list);
//        list.remove(0);
//        list.remove(6);
//        System.out.println(list);
        int arr[]=new int[10];
        for(int i=0;i<5;i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Arrays.copyOf(arr,5)));




    }
}