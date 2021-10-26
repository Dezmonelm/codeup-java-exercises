import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("hi");

//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        Scanner bobsScanner = new Scanner(System.in);

        Boolean confirm;
        do {
            System.out.println("Ask Bob a Question: ");
        String talking = bobsScanner.nextLine();
//                  Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
            if (talking.endsWith("?")) {
        System.out.println("Sure.");
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        } else if (talking.isEmpty()) {
            System.out.println("Fine. Be that way!");
            //        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        } else if (talking.equals(talking.toUpperCase())) {
            System.out.println("Whoa, chill out!");
            //        He answers 'Whatever.' to anything else.
        } else {
            System.out.println("Whatever.");
        }
            //        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        System.out.println("Do you want to continue? (Y/N) ");
        confirm = bobsScanner.nextLine().equalsIgnoreCase("y");
    } while (confirm);
        System.out.println();

    }
}
