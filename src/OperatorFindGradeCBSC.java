import java.util.Scanner;

public class OperatorFindGradeCBSC {
    public static void main(String[] args) {

        System.out.println("finding grade for CBSC students");
        Scanner sc = new Scanner(System.in);
        System.out.println("putting the value of math:");
        float math =sc.nextFloat();
        System.out.println("putting the value of science:");
        float science =sc.nextFloat();
        System.out.println("putting the value of hindi:");
        float hindi =sc.nextFloat();

        float grade= ((math + science + hindi)/300)*10;
        System.out.println("the actual grade is: " +grade);


    }
}
