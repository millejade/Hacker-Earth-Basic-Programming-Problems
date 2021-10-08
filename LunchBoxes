import java.util.Scanner;

public class LucnhBoxes {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
		    int testCases = 0;
        testCases = scan.nextInt();
        scan.nextLine();
        
        for(int j = 0; j<testCases; j++) {
		
			  int N = 0, M = 0; //N = Number of lunch boxes available   M = Number of schools
	
	        N = scan.nextInt();
	        scan.nextLine();
	        M = scan.nextInt();
	        scan.nextLine();
	
	        int[] A = new int[M]; //Number of lunch boxes needed per school
	        long sum = 0;
	
	        for(int i = 0; i<M; i++){
	
	            A[i] = scan.nextInt();
	            scan.nextLine();
	            
	            sum += A[i]; //total number of lunch boxes needed for all
	
	        }
	        
	        if(N >= sum) {  //if Ali can give lunchboxes to all
	        	System.out.println(M);
	        }else {
	
	        	while(sum > N && M != 0) {
	        		long maximumValue = A[0];
	        		for(int k = 1; k < A.length; k++) { //search for maximum value
		        		if(A[k] > maximumValue) {
		        			maximumValue = A[k];
		        		}	
		        	}
		 
		        		sum = sum - maximumValue;
		        		
		        		for(int y = 0; y < A.length; y++){ //identify the index of max val
                            if(A[y] == maximumValue) {A[y] = 0; break;} 
                        }
		        		M--;
	        	}
	        	if(M <= 0) {
	        		M = 0;
	        		System.out.println(M);
	        	}else {
	        	System.out.println(M);
	        	}
	        }
	   
        }



	}

}
