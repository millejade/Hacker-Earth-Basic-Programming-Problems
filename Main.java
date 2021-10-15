package SevenSegmentDisplay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//final int zero = 6, one = 2, two = 5, three = 5, four = 4,
	            //five = 5, six =6, seven = 3, eight = 7, nine = 6

			ArrayList<Character> maxNum = new ArrayList<Character>();
	        int test;
	        String N;
	        int numMatches = 0;
	        Scanner s = new Scanner(System.in);
	        test = s.nextInt();
	        s.nextLine();
	        
	        for(int i = 0; i<test; i++){
	        	//myOut = new String[i];
	           N = s.nextLine(); //N must be 1 - 100

	           for(int j = 0; j<N.length(); j++){
	        	   		
	        	   		if(N.charAt(j)=='0') {
	        	   			numMatches += 6;
	        	   		}
	        	   		if(N.charAt(j)=='1') {
	        	   			numMatches += 2;
	        	   		}
	        	   		if(N.charAt(j)=='2') {
	        	   			numMatches += 5;
	        	   		}
	        	   		if(N.charAt(j)=='3') {
	        	   			numMatches += 5;
	        	   		}
	        	   		if(N.charAt(j)=='4') {
	        	   			numMatches += 4;
	        	   		}
	        	   		if(N.charAt(j)=='5') {
	        	   			numMatches += 5;
	        	   		}
	        	   		if(N.charAt(j)=='6') {
	        	   			numMatches += 6;
	        	   		}
	        	   		if(N.charAt(j)=='7') {
	        	   			numMatches += 3;
	        	   		}
	        	   		if(N.charAt(j)=='8') {
	        	   			numMatches += 7;
	        	   		}
	        	   		if(N.charAt(j)=='9') {
	        	   			numMatches += 6;
	        	   		}	

	                }

	           //System.out.println(numMatches); //>> will print the current number of matches
	           for(int k=0; numMatches != 0; k++) {
	        	   
	        	   if(numMatches%2==0) {
	        		   maxNum.add('1');
	        		   numMatches -= 2;
	        	   }else{
	        			   maxNum.add('7');
		        		   numMatches -= 3;
	        		   }
	           }//System.out.println(maxNum);
	           StringBuilder sb = new StringBuilder();
	           for (Character ch: maxNum) {
	               sb.append(ch);
	           }
	    
	           String string = sb.toString();
	           System.out.println(string);
	           maxNum.removeAll(maxNum);
	       }

	}

}
