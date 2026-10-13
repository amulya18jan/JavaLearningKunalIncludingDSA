package basicsOfJava;

public class FibonacciNumber {
    public static void main(String[] args) {

        int n = 10;
        int prev = 0;
        int current = 1;
        for(int i=0;i<10;i++){
            System.out.print(prev +   " ");
            int temp = prev + current;
            prev = current;
            current=temp;
        }
    }
}
