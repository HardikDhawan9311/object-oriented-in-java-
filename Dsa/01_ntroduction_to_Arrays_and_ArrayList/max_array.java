public class max_array {
    public static int max(int [] arr1){
        int max=arr1[0];

        //getting max value from the array
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr []={1,3,23,9,18};
        int max=max(arr);
        System.out.println(max);

        
    }
}
