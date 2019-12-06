import java.io.*;
import java.util.*;

public class SimpleIsPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean pal = true;
        char init = A.charAt(0);
        char last = A.charAt(A.length()-1);

        if(init != last){
            pal = false;
        }

        if (pal){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }
}
