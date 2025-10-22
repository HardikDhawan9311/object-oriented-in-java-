// In Order-Agnostic Binary Search we didnot know how the array is sorted in ascending or descending Order

public class OrderAgnosticBinary{
    public static void OABinary(int []arr1,int Target){
        int start=0;
        int end=arr1.length-1;

        // check if the array is sorted in ascending order
        if(arr1[start]<arr1[end]){
            while(start<=end){
                int mid=start+(end-start)/2; // taking out the mid

                // if target==mid 
                if(Target==arr1[mid]){
                    System.out.println("(Ascending order Array)Element found on index:"+mid);
                    break;
                }
                // if target>mid then start= mid+1
                else if (Target>arr1[mid]) {
                    start=mid+1;
                }
                // if target<mid then end=mid-1
                else if(Target<mid){
                    end=mid-1;
                }
            }
        }
        // This will only run when there will be the descending order array.
        else if(arr1[start]>arr1[end]){
             while(start<=end){
                int mid=start+(end-start)/2; // taking out the mid

                // if target==mid 
                if(Target==arr1[mid]){
                    System.out.println("(Descending order Array)Element found on index:"+mid);
                    break;
                }
                // if target>mid then start= mid+1
                else if (Target>arr1[mid]) {
                    end=mid-1;
                }
                // if target<mid then end=mid-1
                else if(Target<arr1[mid]){
                    start=mid+1;
                }
            }
        }
    }
    public static void main(String[] args) {

        int []ascending={1,2,3,4,5,6,7,8,9,10};
        OABinary(ascending, 9);

        int []descending={90,89,80,70,60,40,20};
        OABinary(descending, 80);

    }
}