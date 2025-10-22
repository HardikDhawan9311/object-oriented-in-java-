public class Search2DArray {
    
    public static void search2d(int [][] arr1, int Target){
        boolean flag=false;
        // check if the array is empty or not 
        if(arr1.length<=0){
            System.out.println("Its an empty array");
        }

        // searching a particular item from the 2d array
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                if(arr1[i][j]==Target){
                    System.out.println("Your number is found and the element is :"+arr1[i][j]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("Your Target is not found:");
        }
    }
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6,10},{7,8,9}};
        search2d(arr, 10);

    }
}
