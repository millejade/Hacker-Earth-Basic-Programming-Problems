package FindProduct;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	       int n=0;
	       n = s.nextInt();
	       s.nextLine();
	    
	       int arr[] = new int[n];

	       for(int i=0; i<n; i++){
	           arr[i] = s.nextInt();
	           s.nextLine();
	       }

	       long ans = 1;

	       for(int j=0; j<n; j++){
	           ans = (long) ((ans * arr[j]) % (Math.pow(10,9) + 7));
	       }
	       System.out.println(ans);

	}

}
