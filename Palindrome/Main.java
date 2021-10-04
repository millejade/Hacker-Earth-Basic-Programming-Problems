package Palindrome;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		 
	        String input = "";
	       
	        input = s.next();

	         String pal = "";

	        for(int i=(input.length()-1); i>=0; i--){
	            pal = pal + input.charAt(i);
	        }

	     
	        if(pal.equals(input)){
	            System.out.println("YES");
	        }else System.out.println("NO");
	        
	}

}
