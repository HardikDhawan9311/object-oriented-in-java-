import java.util.Arrays;

public class Reversing_Array {
    public static void reversing(int []arr1){
        int start=0;
        int end=arr1.length-1;

        // reversing all the values in the array 
        while(start<end){
                int temp=arr1[start];
                arr1[start]=arr1[end];
                arr1[end]=temp;
            start++;
            end--;
        }

        //displaying all the values of the array 
        System.out.print(Arrays.toString(arr1));


    }
    public static void main(String[] args) {
        int [] arr ={9,88,76,66,55,44,33};
        reversing(arr);
    }
}
