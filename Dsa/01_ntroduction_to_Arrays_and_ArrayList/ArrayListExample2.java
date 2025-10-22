import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample2 {
    

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Taking Inputs
        for(int i=0;i<5;i++){
            list.add(scan.nextInt());
        }

        System.out.println(list.get(2));

        System.out.println(list);
    }
}
