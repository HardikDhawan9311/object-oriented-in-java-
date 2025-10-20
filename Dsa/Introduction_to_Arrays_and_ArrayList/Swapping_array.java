import java.util.Arrays;

public class Swapping_array {

    public static void swap(int [] arr1,int index1,int index2){
        int temp=arr1[index1];
        arr1[index1]=arr1[index2];
        arr1[index2]=temp;
        System.out.println(Arrays.toString(arr1));

        

        
    }
    public static void main(String[] args) {
        int arr []={1,3,23,9,18};
        swap(arr,0,2);


    }
}
