package Divisible;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		
		String num[] = new String[n];
		//String number1[] =new String[n];
		//String number2[] =new String[n];
		String numbFirst = "";
		String numbLast = "";
		
		for(int i=0; i<n; i++) {
			num[i] = sc.next();
			sc.nextLine();
		}
		
		for(int j=0; j<n/2; j++) {
			//number1[j] = "" + num[j];
			numbFirst = numbFirst + num[j].charAt(0);
		}
		
		
		for(int j= n/2; j<n; j++) {
			//number2[j] = "" + num[j];
			//System.out.println(number2[j]);
			int m = num[j].length() - 1;
			numbLast = numbLast + num[j].charAt(m);
			//System.out.println(m);
		}
		
		String finalNum = numbFirst + numbLast;
		int number = Integer.parseInt(finalNum);
		
		System.out.println(number);
		if(number%11==0) {
			System.out.println("OUI");
		}else System.out.println("NON");

		sc.close();
	}

}
