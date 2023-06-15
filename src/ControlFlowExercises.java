import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);


//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);

//
//        long k = 2;
//        while (k < 1000000) {
//            System.out.println(k);
//            k *= k;
//        }

        for (int j = 100; j >= -10; j -= 5) {
            System.out.println(j);
        }


        for (long k = 2; k < 1000000; k = k * k) {
            System.out.println(k);
        }

        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }

        Scanner input = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer: ");
            int n = input.nextInt();
            System.out.println("Number\tSquared\tCubed");
            System.out.println("======\t=======\t=====");
            for (int b = 1; b <= n; b++) {
                System.out.println(b + "\t" + b * b + "\t" + b * b * b);
            }
            System.out.print("Continue? (y/n): ");
            choice = input.next();
            System.out.println();
        }

        Scanner userInput = new Scanner(System.in);
        int grade;
        String letterGrade;
        char solution;

        do {
            System.out.print("Enter a numerical grade from 0 to 100: ");
            grade = input.nextInt();

            if (grade >= 97 && grade <= 100) {
                letterGrade = "A+";
            } else if (grade >= 93 && grade <= 96) {
                letterGrade = "A";
            } else if (grade >= 90 && grade <= 92) {
                letterGrade = "A-";
            } else if (grade >= 87 && grade <= 89) {
                letterGrade = "B+";
            } else if (grade >= 83 && grade <= 86) {
                letterGrade = "B";
            } else if (grade >= 80 && grade <= 82) {
                letterGrade = "B-";
            } else if (grade >= 77 && grade <= 79) {
                letterGrade = "C+";
            } else if (grade >= 73 && grade <= 76) {
                letterGrade = "C";
            } else if (grade >= 70 && grade <= 72) {
                letterGrade = "C-";
            } else if (grade >= 67 && grade <= 69) {
                letterGrade = "D+";
            } else if (grade >= 63 && grade <= 66) {
                letterGrade = "D";
            } else if (grade >= 60 && grade <= 62) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }

            System.out.println("The corresponding letter grade is " + letterGrade);

            System.out.print("Do you want to continue? (Y/N): ");
            solution = userInput.next().charAt(0);
        } while (solution == 'Y' || solution == 'y');

//        Testing secondary branch
    }
}
