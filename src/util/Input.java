package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public Boolean yesNo(){
        System.out.println("Yes or No?");

        String userInput = this.scanner.nextLine();

        userInput = userInput.toLowerCase();

        switch(userInput) {
            case ("no"):
                return false;
            case ("n"):
                return false;
            case ("nah"):
                return false;
            case ("nope"):
                return false;
            case ("yes"):
                return true;
            case ("y"):
                return true;
            case ("yup"):
                return true;
            case ("yeah"):
                return true;
            case  ("maybe"):
                System.out.println("Ain't you cute?");
                return yesNo();
            default:
                System.out.println("\"Input not acceptable\" = " + "Input not acceptable");
                return yesNo();
        }
    }

    public int getInt(){
        System.out.println("Please enter an Int");

        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        System.out.println("Please enter an number within the range");
        int userInput = this.scanner.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        } else {
            return getInt(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Please enter an Double");
        return this.scanner.nextDouble();
    }
}
