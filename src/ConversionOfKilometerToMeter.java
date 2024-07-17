import java.util.Scanner;

public class ConversionOfKilometerToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the Kilo-meter:");
        float kilometer = sc.nextFloat();

        float meter = kilometer*1000;
        System.out.println("the conversion of " +kilometer+" kilometer is eqaul to " +meter+ " meter.");
    }
}
