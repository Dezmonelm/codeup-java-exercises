import java.util.Arrays;

public class ArraysExercises {

//      System.out.println(Arrays.toString(plusOneDude));

//    plusOneDude[plusOneDude.length - 1] = "peeps.getNames()";

    public static Person[] addPerson(Person[]array, Person person) {
        Person[] plusOneDude = Arrays.copyOf(array, array.length + 1);

        plusOneDude[plusOneDude.length - 1] = person;

        return plusOneDude;
//        System.out.println(plusOneDude);
    }
    public static void main(String[] args) {

//        What happens when you run the following code? Why is Arrays.toString necessary?
//        The memory of the array shows up. You need to make is a string to be visible
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] peeps = new Person[3];
        peeps[0] = new Person("Dez");
        peeps[1] = new Person("Kristy");
        peeps[2] = new Person("Denver");

        for(int i = 0; i < peeps.length; i++) {
            System.out.println(peeps[i].getName());
        }

        Person num4 = new Person("Naomi");

        Person[] anotherDude = ArraysExercises.addPerson(peeps, num4);
        for (Person person : anotherDude) {
            System.out.println(person.getName());
        }





    }

}
