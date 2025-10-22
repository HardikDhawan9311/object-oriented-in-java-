public class RangeLinearSearch {
    
    public static int RangeLinear(int[] arr1,int start,int end,int Target){
        // checks if the array is empty
        if(arr1.length<=0){
            return -1;
        }

        // iterting through specific range
        for(int i=start;i<=end;i++){
            if(arr1[i]==Target){
                return i;
            }
        }

        // if the target is not found then it will show -1
        return -1;
    }

    public static void main(String[] args) {
        int []arr ={18,12,-7,3,14,28};
        int a=RangeLinear(arr, 1, 4, 2);
        System.out.print(a);
    }
}
