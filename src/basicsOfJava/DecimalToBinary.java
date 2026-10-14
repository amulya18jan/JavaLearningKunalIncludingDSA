package basicsOfJava;

public class DecimalToBinary {
    public static String convertDecimalToBinary(int num){
     if(num==0)return "0";
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;
            binary.insert(0, remainder);
            num = num / 2;
        }

        return binary.toString();
    }
    public static void main(String[] args) {
        int decimal =987654321;
        System.out.println(decimal+" = "+convertDecimalToBinary(decimal));
    }
}
