import java.util.*;
public class Arrays2 {
    
    
    public static void main(String[] args) {
        // Array of objects
        Scanner scan=new Scanner(System.in);
        String str []= new String[4];

        System.out.println("Enter your strings in array:");
        // taking inputs
        for(int i=0;i<4;i++){
            str[i]=scan.next();
        
        }

        //displaying it
        // for(String s:str){
        //     System.out.print(s+" ");
        // }

        System.out.println(Arrays.toString(str));
    }
}
