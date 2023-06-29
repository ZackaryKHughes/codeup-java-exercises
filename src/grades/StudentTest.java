package grades;

public class StudentTest {
    public static void main(String[] args) {

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


    }
}
