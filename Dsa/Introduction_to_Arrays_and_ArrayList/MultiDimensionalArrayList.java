
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        // intialization of array list
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        // taking inputs 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(scan.nextInt());
            }
        }

        System.out.print(list);
    }
}
