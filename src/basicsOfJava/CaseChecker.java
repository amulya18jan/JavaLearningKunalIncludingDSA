package basicsOfJava;

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().trim().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("Lowercase");
        }
        if(ch>='A'&& ch<='Z'){
            System.out.println("Uppercase");
        }
        if(ch>='1'&& ch<='9'){
            System.out.println("Number");
        }else{
            System.out.println("Symbol");
        }


    }
}
