import java.util.Scanner;



public class IsPalin{

	private static boolean isPalindrome(String str){
		int i =0;
		int j = str.length()-1;
		
		while (i<j){
			if(str.charAt(i)!= str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}// end while
		return true;
	}//end method



	public static void main(String[] args){
	    
	    String str = "11";
	    
	
		if(isPalindrome(str)){
			System.out.println("True");
		}else {
			System.out.println("False");		
}

	}



}