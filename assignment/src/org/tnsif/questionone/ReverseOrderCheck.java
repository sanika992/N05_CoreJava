package org.tnsif.questionone;

import java.util.Scanner;

public class ReverseOrderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the value of n
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        
        int[] pinkyNumbers = new int[n];
        int[] maryNumbers = new int[n];
        
        // Read the numbers said by Pinky
        System.out.println("Numbers said by Pinky");
        for (int i = 0; i < n; i++) {
            pinkyNumbers[i] = scanner.nextInt();
        }
        
        // Read the numbers said by Mary
        System.out.println("Numbers said by Mary");
        for (int i = 0; i < n; i++) {
            maryNumbers[i] = scanner.nextInt();
        }
        
        // Check if Mary's numbers are in reverse order of Pinky's numbers
        boolean isReverseOrder = true;
        for (int i = 0; i < n; i++) {
            if (pinkyNumbers[i] != maryNumbers[n - 1 - i]) {
                isReverseOrder = false;
                break;
            }
        }
        
        // Output the result
        if (isReverseOrder) {
            System.out.println("Yes, it is in reverse order");
        } else {
            System.out.println("No, it is not in reverse order");
        }
        
        scanner.close();
    }
}
