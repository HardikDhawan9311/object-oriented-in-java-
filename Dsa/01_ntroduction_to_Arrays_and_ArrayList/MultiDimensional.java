public class MultiDimensional {
    /* 
    1 2 3
    4 5 6
    7 8 9
    */

    public static void multi_dimensional_array(){
        int arr[][]=new int[3][3];
        int num=1;
        // loop for putting values
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                arr[i][j]=num; // assigning num to arr[i][j]
                System.out.print(arr[i][j]+" "); // printing on the screen
                num++;
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        multi_dimensional_array();
    }
}
