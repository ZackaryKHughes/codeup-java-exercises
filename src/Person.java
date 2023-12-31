import java.util.Arrays;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, from %s.%n", name);
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Tom");
//
//        System.out.println("person1.getName() = " + person1.getName());
//        person1.setName("Tom Jerry");
//        System.out.println("person1.getName() = " + person1.getName());
//
//        person1.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("William");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


    }

}
