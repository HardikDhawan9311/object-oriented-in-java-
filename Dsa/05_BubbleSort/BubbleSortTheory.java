
import java.util.Arrays;

class BubbleSortTheory{

    public static int[] BubbleSort(int[] arr2){
        //checking if the array is empty
        if(arr2.length==0){
            return new int[-1];
        }
        else{
            for (int i = 0; i <arr2.length; i++) {
                for(int j=1;j<arr2.length-i;j++){
                    if(arr2[j-1]>arr2[j]){
                        int temp=arr2[j];
                        arr2[j]=arr2[j-1];
                        arr2[j-1]=temp;
                    }
                }
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr1[]={10,9,8,7,6,5,4,3,2,1};
        int []arr3=BubbleSort(arr1);
        System.out.println(Arrays.toString(arr3));
    }
}


// bubble sort also known as Sinking Sort / Exchange Sort.