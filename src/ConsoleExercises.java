import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.", pi);


        Scanner input = new Scanner(System.in);
        System.out.print(" Enter an integer: ");

        try {
            int num = input.nextInt();
            System.out.println("You entered " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 words separated by space:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a sentence:");
//        String sentence = sc.nextLine();
//        System.out.println("You entered: " + sentence);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a sentence:");
//        String sentence = sc.nextLine();
//        System.out.println("You entered: " + sentence);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the classroom:");
//        double length = sc.nextDouble();
//        System.out.println("Enter the width of the classroom:");
//        double width = sc.nextDouble();
//        System.out.println("The area of the classroom is " + (length * width) + " square feet.");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the classroom:");
//        String lengthStr = sc.nextLine();
//        double length = Double.parseDouble(lengthStr);
//        System.out.println("Enter the width of the classroom:");
//        String widthStr = sc.nextLine();
//        double width = Double.parseDouble(widthStr);
//        System.out.println("The area of the classroom is " + (length * width) + " square feet.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the classroom:");
        String lengthStr = sc.nextLine();
        double length = Double.parseDouble(lengthStr);
        System.out.println("Enter the width of the classroom:");
        String widthStr = sc.nextLine();
        double width = Double.parseDouble(widthStr);
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("The area of the classroom is " + area + " square feet.");
        System.out.println("The perimeter of the classroom is " + perimeter + " feet.");
    }

}
