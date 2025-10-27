public class SearchMatrix{

    public static int matrixsearching(int [][] arr,int Target){
        int row=0;
        int col=arr[row].length-1;

        while(row<arr.length && col>=0){
            if (arr[row][col]==Target) {
                return Target;
            }
            else if(arr[row][col]<Target){
                row++;
            }
            else{
                col--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][] matrix={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int result=matrixsearching(matrix, 37);
        System.out.println(result);
    }
}