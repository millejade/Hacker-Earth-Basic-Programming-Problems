package Zoos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 int x = 0;
	       int y = 0;
	        Scanner s = new Scanner(System.in);
	        String in = s.nextLine();
	        


	        for(int i = 0; i < in.length(); i++){
	            if(in.charAt(i) == 'z') {
	            	x++;
	            }else y++; 
	        }
	        y = 2*x;
	        if(x == y) System.out.println("Yes");
	        else System.out.println("No");

	}

}
