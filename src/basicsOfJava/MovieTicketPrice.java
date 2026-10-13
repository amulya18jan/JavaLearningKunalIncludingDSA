package basicsOfJava;

import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Are you student Yes or No");
        sc.nextLine();
        String studentID = sc.nextLine();
        if(age<5){
            System.out.println("Movie ticket price free");
        } else if (age>=60) {
            System.out.println("Movie ticket price is: $"+7);
        }else{
            if(studentID.equalsIgnoreCase("yes")){
                System.out.println("Movie ticket price is: $"+9);
            }else{
                System.out.println("Movie ticket price is: $"+13);
            }
        }
    }
}
