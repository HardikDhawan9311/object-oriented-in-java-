public class Binary {
    
    public static void BinarySearch(int [] arr1,int Target){
        int start=0;
        int end=arr1.length;
        


        while(start<=end){
        int mid=(end+start)/2;
            // if Target == mid then this will run 
        if(Target==arr1[mid]){
            System.out.println("Target Founded"+" "+Target);
            break;
        }

        else if(Target>arr1[mid]){
            start=mid+1;
        }

        else if(Target<arr1[mid]){
            end=mid-1;
        }
    }
        
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9,10,19,20};
        BinarySearch(arr, 3);
    }
}
