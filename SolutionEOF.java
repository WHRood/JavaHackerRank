import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class SolutionEOF{

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String outputString = "";
    int counter = 1; 
   

    while(scan.hasNext()) {
    outputString = scan.nextLine();
    
    System.out.println(counter  +" "+ outputString);
    counter = counter + 1;
    }

        

    }
}
