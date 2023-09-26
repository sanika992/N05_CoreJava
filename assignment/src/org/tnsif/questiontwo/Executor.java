package org.tnsif.questiontwo;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        // Get customer details
        System.out.println("Enter Customer Name");
        String customerName = scanner.nextLine();
        System.out.println("Enter Phone Number");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter address");
        String address = scanner.nextLine();

        CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, address);

        // Get bero type
        System.out.println("Enter Bero Type");
        String beroType = scanner.nextLine();

        Bero bero = null;

        // Check bero type and create the corresponding object
        if (beroType.equals("Steel Bero"))
        {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();
            System.out.println("Enter Bero Height");
            int beroHeight = scanner.nextInt();
            bero = (Bero) new SteelBero(beroType, beroColour, beroHeight);
        } 
        else if (beroType.equals("Wooden Bero")) 
        {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();
            System.out.println("Enter Wood Type");
            String woodType = scanner.nextLine();
            bero = new WoodenBero(beroType, beroColour, woodType);
        }
        else
        {
            System.out.println(beroType + " is an invalid bero type");
            scanner.close();
            return;
        }

        // Calculate the total price and discount
        bero.calculatePrice();
        Discount discount = new Discount();
        double discountAmount = discount.calculateDiscount(bero);
        double totalPrice = bero.price - discountAmount;

        // Display the total price
        System.out.printf("Amount needs to be paid %.2f%n", totalPrice);

        scanner.close();
	}
}



