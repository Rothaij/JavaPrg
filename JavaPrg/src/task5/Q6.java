package task5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input");
        
        int month = sc.nextInt();
        
        double rentPerDay = sc.nextDouble();
        
        int numberOfDays = sc.nextInt();
        
        System.out.println("Output");
        
        boolean isPeakSeason = false;

        switch (month) {
        
            case 4: case 5: case 6: 

            case 11: case 12: 

                isPeakSeason = true;
                
                break;
            default:
            	
                isPeakSeason = false;
        }

        if (isPeakSeason) {
        	
            rentPerDay = rentPerDay + (rentPerDay * 0.20);
        }

        double total = rentPerDay * numberOfDays;
        
        System.out.printf("%.2f\n", total);
    }
}