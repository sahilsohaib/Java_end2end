import java.util.Scanner;

public class ComparisonOperator_FindGivenNumberIsSmallerOrGreater {
    public static void main(String[] args) {
        System.out.println("the number is 100. Please enter a number and if your number is smaller then it says 'smaller' otherwise the number is grateer");

        System.out.println("Enter your number here");
        Scanner sc= new Scanner(System.in);
         float yourNum = sc.nextFloat();
         if(yourNum>100){
             System.out.println("your number is greater than 100");
         } else if (yourNum<100) {
             System.out.println("your number is less than 100");
         }else{
             System.out.println("your number is 100");
         }
    }
}
