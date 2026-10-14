package basicsOfJava;

import java.util.Scanner;

public class SafeChecker {

        public static void main(String[] args) {
            String correctPassword = "admin123";
            Scanner sc = new Scanner(System.in);
            int attemptsLeft = 3;
            boolean accessGranted = false;
            while (attemptsLeft > 0) {
                System.out.print("Enter the password (Attempts left: " + attemptsLeft + "): ");
                String password = sc.nextLine();
                if (password.equals(correctPassword)) {
                    System.out.println("Access Granted!");
                    accessGranted = true;
                    break;
                } else {
                    attemptsLeft--;
                    System.out.println("Access Denied. Try again.");
                }
            }
            if (!accessGranted) {
                System.out.println("System Locked!");
            }
            sc.close();
        }
    }

