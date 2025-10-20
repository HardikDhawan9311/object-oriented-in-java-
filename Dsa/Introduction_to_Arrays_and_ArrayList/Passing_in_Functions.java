import java.util.*;
public class Passing_in_Functions {
    
    public static void change_array(int arr[]){
        arr[1]=89;
    }
    public static void main(String[] args) {

        
        int arr[]={1,2,3,4,5};
        change_array(arr);
        System.out.println(Arrays.toString(arr));


        
    }
}
