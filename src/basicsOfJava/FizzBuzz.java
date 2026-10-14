package basicsOfJava;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 50;
        int fizzCount = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
                fizzCount++;
            }
            else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
                fizzCount++;
            }

            else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("\nTotal times 'Fizz' was printed: " + fizzCount);
    }
}
