package MinimumMoves;

import java.util.Scanner;

public class MinimumMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int T = 0;
		int X = 0;
		int Y = 0;
		
		Scanner scan = new Scanner(System.in);
		
		T = scan.nextInt();
		
		for(int i = 0; i<T; i++) {
			X = scan.nextInt(); scan.nextLine();
			Y = scan.nextInt(); scan.nextLine();
			if(X<0||Y<0||X<Y) {
				System.out.println("-1");
			}else System.out.println(X);
		}
		
		
	}
}
