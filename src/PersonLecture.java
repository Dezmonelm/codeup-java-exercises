public class PersonLecture {
    //A class: this is a template or blueprint for a 'person'

    //instance variables
    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat() {
        return lastName + " , " + firstName + " has joined the chat!";
    };

    //Make a static property - representing the world population
    public static long worldPop = 7_753_000_000L;

    public static void main(String[] args) {
        PersonLecture dez = new PersonLecture();

        dez.firstName = "Dez";
        dez.lastName = "Musgrove";

        System.out.println("dez = " + dez);
        System.out.println(dez.firstName + " " + dez.lastName + " is my name!");

        System.out.printf("%s %s is my name !%n", dez.firstName, dez.lastName);

        System.out.println(dez.joinChat());

        System.out.println("worldPop = " + worldPop);

        PersonLecture douglas = new PersonLecture();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        //Douglas didn't get counted


        //do this instead
        PersonLecture.worldPop += 1;

        System.out.println("worldPop with Douglas :D = " + worldPop);
//        System.out.println(douglas.worldPop); // works but not proper

        //Can not do
//        System.out.println(Person.firstName);
    }
}
