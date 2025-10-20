public class minLinearSearch {
    
    public static int max(int [] arr1){
        //checks if the array is empty
        if(arr1.length<0){
            return -1;
        }

        //checks the min number
        int max=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        return max;
    }


    public static int min(int [] arr1){
        //checks if the array is empty
        if(arr1.length<=0){
            return -1;
        }

        //checks the min number
        int min=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]<min){
                min=arr1[i];
            }
            
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr={90,88,76,77,89,100};
        int max=max(arr);
        System.out.println(max);

        int min=min(arr);
        System.out.println(min);

    }
}
