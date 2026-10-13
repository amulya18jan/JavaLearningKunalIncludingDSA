package basicsOfJava;

import java.util.Scanner;

public class SmartBillCalculator {
  public  static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Total bill :");
        double totalBill = sc.nextDouble();
        System.out.println("Enter the Tip you want to give :");
        int tipPercentage = sc.nextInt();
        System.out.println("Enter how many people to slipt the bill :");
        int noOfPeople = sc.nextInt();
        double totalTip = totalBill*tipPercentage/100;
        double finalBill = totalBill+totalTip;
        double split = finalBill/noOfPeople;
        System.out.println("The final bill is :"+finalBill+" "+"how much each person owes :"+ split);
      int integerSplit = (int) split;
      System.out.println("Each person owes roughly (rounded down): $" + integerSplit);
    }
}
