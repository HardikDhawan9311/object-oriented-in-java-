
import java.util.ArrayList;

public class ArrayListExample {
    
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);

        list.add(90);
        list.add(99);
        list.add(87);

        System.out.println(list);

        // updating in the list 
        list.set(2, 10);


        System.out.println(list);

        // removing an element from the list
        list.remove(0);

        System.out.println(list);

    }
}
