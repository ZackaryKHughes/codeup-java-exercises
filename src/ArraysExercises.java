import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person personToAdd) {
        Person[] newPersons = Arrays.copyOf(people, people.length + 1);
        newPersons[newPersons.length - 1] = personToAdd;
        return newPersons;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Zackary");
        people[1] = new Person("Stephen");
        people[2] = new Person("Micha");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        people = addPerson(people, new Person("David"));
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }


}
