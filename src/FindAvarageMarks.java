import java.util.Scanner;

public class FindAvarageMarks {
    public static void main(String[] args) {
        System.out.println("Enter the marks of the given subjects");
        Scanner sc = new Scanner(System.in);                   //System.in taking input from user

        //boolean shouldInputBeIntegerOrNot = sc.hasNextInt(); //hasNextInt says the user input is Integer form or not
        //System.out.println(shouldInputBeIntegerOrNot);       //it gives a boolean value



        System.out.println("enter the English Mark:");
        int english = sc.nextInt();
//        boolean shouldInputBeIntegerOrNot = sc.hasNextInt();
//        System.out.println(shouldInputBeIntegerOrNot);

        System.out.println("enter the Math Mark:");
        int math = sc.nextInt();

        System.out.println("enter the Science Mark:");
        int science = sc.nextInt();

        System.out.println("enter the Social_science Mark:");
        int social_science = sc.nextInt();

        System.out.println("enter the EVS Mark:");
        int evs = sc.nextInt();

        int averageMark = (english+ math + science + social_science + evs)/5;
        System.out.println("Average marks of all subject will be:" +averageMark);


    }
}
