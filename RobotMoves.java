package RobotMoves;

import java.util.Scanner;

public class RobotMoves {

	public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        int t = 0;
	        t = s.nextInt();
	        s.nextLine();
	        
	        
	        for(int i = 0; i<t; i++) {
	        	long n = 0;
	        	n  = s.nextLong();
	        	s.nextLine();

	        	System.out.println(n*(n+1));
	        }
	        
	        
	        
	}

}
