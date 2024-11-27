/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compsecurityencryptionproject;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Menu2 {
   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author MyPC
 */

     public static void runMenu() {
        Scanner scanner = new Scanner(System.in); // Use a single scanner instance
        int choice;

        while (true) {
            try {
                System.out.println("\n--- Encryption Menu ---");
                System.out.println("1. Encrypt a File");
                System.out.println("2. Decrypt a File");
                System.out.println("3. Quit the application");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.println("Your encryption mathod should be done here");
                      FromScretch.encrypt(scanner);
                        break;

                    case 2:
                        System.out.println("2. Decrypt a File");
                        System.out.println("Your decryption method should be done here");
                        break;

                    case 3:
                        System.out.println("3. Quit the application");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice, please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 3.");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
    
}
 

