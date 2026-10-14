package basicsOfJava;

import java.util.Scanner;

public class Largest {
   public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number1");
        int n1= sc.nextInt();
        System.out.println("Enter a number2");
        int n2= sc.nextInt();
        System.out.println("Enter a number3");
        int n3= sc.nextInt();
        int max =n1;
        if(n2>max){
            max =n2;
        }
        if(n3>max){
            max =n3;
        }
       System.out.println(max);
    }
}
