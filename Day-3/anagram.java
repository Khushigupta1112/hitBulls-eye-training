import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "tzr";

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1 , arr2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



        

        
    }
    
    }
