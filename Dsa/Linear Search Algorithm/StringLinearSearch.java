public class StringLinearSearch {
    
    public static boolean String_Linear(String[] str1,String Target){
        // check if the array is empty
        if(str1.length<=0){
            return false;
        }

        // matching an element
        for(String element:str1){
            
            if(element.equals(Target)){
                return true;
            }
        }
        // if the element is not found then false
        return false;
    }

    public static void main(String[] args) {
        String str[]={"I","am","kunal","hardik","Sarita"};
        boolean s=String_Linear(str, "Sarita");
        System.out.println(s);
    }
}
