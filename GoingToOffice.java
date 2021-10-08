package GoingToOffice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 long distance = 0;
	        long onlineCost = 0, onlineFirst = 0, onlineDistKM = 0;
	        long classicSpeed = 0, classicBaseFare = 0, classicMin = 0, classicDistKM =0;

	        Scanner s = new Scanner(System.in);

	        distance = s.nextLong();
	        s.nextLine();
	        onlineCost = s.nextLong();
	        s.nextLine();
	        onlineFirst = s.nextLong();
	        s.nextLine();
	        onlineDistKM = s.nextLong();
	        s.nextLine();

	        classicSpeed = s.nextLong();
	        s.nextLine();
	        classicBaseFare = s.nextLong();
	        s.nextLine();
	        classicMin = s.nextLong();
	        s.nextLine();
	        classicDistKM = s.nextLong();
	        s.nextLine();

	        float onlineTotalCost = 0;
	        float classicTotalCost = 0;
	        
	        System.out.println(onlineTotalCost);
	        System.out.println(classicTotalCost);
	        
	        onlineTotalCost = onlineCost + (distance - onlineFirst) * onlineDistKM;
	        classicTotalCost = classicBaseFare + (distance/classicSpeed) * classicMin + (distance * classicDistKM);
	        
	        if((onlineTotalCost==classicTotalCost) || (onlineTotalCost > classicTotalCost)){
	            System.out.println("Online Taxi");
	        }else if(classicTotalCost > onlineTotalCost){
	            System.out.println("Classic Taxi");
	        }
	        
	}

}
