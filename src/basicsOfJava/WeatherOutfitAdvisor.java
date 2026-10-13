    package basicsOfJava;

    import java.util.Scanner;

    public class WeatherOutfitAdvisor {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter temp in celsius :");
            int temp = sc.nextInt();
            System.out.println("Whether is raining : true or false");
            boolean rain = sc.nextBoolean();
            if(rain&&temp<15){
                System.out.println("Wear a heavy waterproof coat and boots.");
            } else if (rain&&temp>=15) {
                System.out.println("Bring an umbrella and wear a light jacket.");
            } else if (!rain&&temp>=25) {
                System.out.println("It is warm! Shorts and a t-shirt are perfect.");
            }else{
                System.out.println("Wear a comfortable sweater.");
            }

        }
    }
