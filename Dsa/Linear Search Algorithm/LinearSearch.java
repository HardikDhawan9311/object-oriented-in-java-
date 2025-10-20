class LinearSearch{

    public static void linearSearchitems(int[] arr1,int number){
        boolean flag=false;
        
        // iterating through each and every array[items]
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]==number) {
              System.out.println("founded");
              flag=true;
            
            }
           
        
        }

         if(flag==false){
                System.out.println("Nope");
                
            }
       
        
    }
    public static void main(String args[]){
        int [] arr={18,12,9,14,77,50};
       linearSearchitems(arr,50);
       
        
    }
}