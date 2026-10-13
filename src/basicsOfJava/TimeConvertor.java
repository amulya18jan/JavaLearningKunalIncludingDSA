package basicsOfJava;

import java.util.Scanner;

public class TimeConvertor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Total number of seconds");
        int sec = sc.nextInt();
        int hour = sec/3600;
        int remainSec  = sec%3600;
        int min =remainSec/60;
        int second = remainSec-(min*60);
        System.out.println("Hours :"+hour+" "+" Minutes :"+min+" "+ "Seconds:"+second);
    }
}
