package AliHelping;

import java.util.Scanner;

public class Ali {

	public static void main(String[] args) {

		String in = "";
		Scanner s = new Scanner(System.in);
		in = s.nextLine();
		
		char[] input = in.toCharArray();
		
		int i;
		
		for(i=0; i<9; i++) {
			
			if(((i!=0 && i!=3)&& i!=6)&&i!=2) {
				
					if(i!=7) {
						if((input[i] + input[i-1])%2 != 0) break;
						//else continue;
					}
				
				}else if(i==2){
					if(input[2] == 'A' || input[2] == 'E' || input[2] == 'I' || input[2] == 'O' || input[2] == 'U' || input[2] == 'Y') break;
					//else continue;
					}

		}
		
		if(i==9) System.out.println("valid");
		else System.out.println("invalid");
		
		}


	}

