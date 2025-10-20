public class MultiDimensional_question {
    
    /*
     1 2 3
     4 5
     6 7 8 9
     */
    

     public static void pattern(){
        int arr1[][]={
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };

        // input numbers in the array 
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        pattern();
        

    }
}
