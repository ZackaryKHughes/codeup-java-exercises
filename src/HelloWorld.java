public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        //   1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 11;

        System.out.println("myFavoriteNumber = " + myFavoriteNumber);

        //   2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        String myString = "Hello, my name is Zackary";

        System.out.println(myString);

        //   3. Change your code to assign a character value to myString. What do you notice?
        // Get an error stating it's a String not a char.

        //   4. Change your code to assign the value 3.14159 to myString. What happens?
        // Get an error recommending to use double.

        //   5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        // Variable 'myNumber' might not have been initialized

        //   6. Change your code to assign the value 3.14 to myNumber. What do you notice?
        // Required type: long Provided: double

        //   7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        //   8.Change your code to assign the value 123 to myNumber.
        //    Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        //    In Java, assigning the value 3.14 to a variable declared as a long does not compile because 3.14 is a double literal and cannot be automatically converted to a long. However, assigning an integer value does compile because the integer literal can be automatically converted to a long.

        //   9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        //       Required type: float Provided: double. Change float to double
        double myNumber = 3.14;


        System.out.println(myNumber);
        System.out.println("myNumber = " + myNumber);

        // 10.

//        int x = 5;
//        System.out.println(x++);
        // Result returns 5
//        System.out.println(x);
        // Result returns 6

//        int x = 5;
//        System.out.println(++x);
////        Result returns 6
//        System.out.println(x);
//        Result returns 6

//        11. Try to create a variable named class. What happens?
//        class
//        Identifier expected

//         12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//      String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//
//        int three = (int) "three";
//        java: incompatible types: java.lang.String cannot be converted to int

//       13. Rewrite the following expressions using the relevant shorthand assignment operators:
//
//        int x = 4;
//        x = x + 5;
//
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
//        int z = y * x;
//
//        System.out.println("z = " + z);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//
//        System.out.println("y = " + y);

//       14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//        If you assign a value to a numerical variable that is larger (or smaller) than the type can hold, the memory will overflow and the value will get negative or positive12. For example, if you try to initialize a variable value Integer.MAX_VALUE + 1, it will result in -21474836481.

//        If you increment a numeric variable past the type’s capacity, it will wrap around to the type’s minimum value3. For example, if you increment an int variable past its capacity, it will wrap around to Integer.MIN_VALUE1.

//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

    }






}