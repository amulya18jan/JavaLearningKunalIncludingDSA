package basicsOfJava;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want: ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
