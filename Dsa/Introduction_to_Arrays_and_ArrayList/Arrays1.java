
import java.util.*;
class Arrays1{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int arr []=new int[5];  // array defined

        System.out.println("Enter your for the array:");
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();

        }

        // // for each loop
        // for(int n:arr){  // here n represents element of array
        //     System.out.print(n+" ");
        // }
        
        System.out.print(Arrays.toString(arr));

    }
}