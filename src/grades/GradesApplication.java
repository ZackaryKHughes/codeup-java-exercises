package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("William");
        Student student2 = new Student("Jeffery");
        Student student3 = new Student("Johnny");

        student1.addGrade(100);
        student1.addGrade(94);
        student1.addGrade(97);
        student1.addGrade(94);
        student1.addGrade(91);

        student2.addGrade(88);
        student2.addGrade(87);
        student2.addGrade(83);
        student2.addGrade(90);
        student2.addGrade(80);


        student3.addGrade(77);
        student3.addGrade(81);
        student3.addGrade(79);
        student3.addGrade(76);
        student3.addGrade(79);

        students.put("WilliamRocks", student1);
        students.put("JefferyAnon", student2);
        students.put("JohnnyJones", student3);

    Input in = new Input();

    boolean resp = true;

    while(resp){
         System.out.println("Welcome!\n");

        System.out.println("Here are the GitHub usernames of our students: \n");

        String s = "";
        for ( String key: students.keySet()){
            s += " | " + key ;

        }

        System.out.println(s + " | \n");

        System.out.println("Which student would you like information about?");

        String userInput = in.getString();

        if(students.containsKey(userInput)){
            System.out.printf("Student Name: \"%s\";%nStudent GitHub Username: \"%s\";%nStudent Grade Average: %.2f;%n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());

//            students.get(userInput).getName();
//            userInput;
//            students.get(userInput).getGradeAverage();
        } else {
            System.out.println("I'm sorry, but that username is not valid.");
        }

        System.out.println("Do you wish to continue? \n");

        resp = in.yesNo();
    }
        System.out.println("Thank you. Have a great day!");

    }
}
