/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathematicallyBeautiful;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int test = 0;
        long x = 0;
        int k = 0;
        int n = 0;
        
        
        Scanner s = new Scanner(System.in);
        
        test = s.nextInt();
        s.nextLine();
        x = s.nextInt();
        s.nextLine();
        k = s.nextInt();
        s.nextLine();
        
        n = (int) ((Math.log(x))/Math.log(k));
        String[] arr = new String[test];
        
        for(int j = 0; j<test; j++){
            for(int i=n; x>Math.pow(k, n); i = n){
            
                x = (long)(x-Math.pow(k, n));
                n = (int) ((Math.log(x))/(Math.log(k)));
                if(k>x) break;
            }
            if(x==1 || x==0) arr[j]="Yes";
            else arr[j]="No";
            
            x = s.nextInt();
            s.nextLine();
            k = s.nextInt();
            s.nextLine();
            
        }
        for(int i = 0; i<test; i++){
        System.out.println(arr[i]);
        }
        
    }
    
}
