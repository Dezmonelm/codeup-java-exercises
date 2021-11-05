import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {
        //Old way: Array initial;izer .. not as easy to work with
//        String[] nameOfVar = {"thing1", "thing2", "Thing3"};
//
//        System.out.println(nameOfVar[3]);

        ArrayList<String> students = new ArrayList<>();

        students.add("mcDezmone");
        students.add("mcCody");

        System.out.println("student.size() = " + students.size());
        System.out.println(students);
        System.out.println();

        ArrayList<Integer> myFavoriteNums = new ArrayList<>();

        myFavoriteNums.add(2);
        myFavoriteNums.add(24);
        myFavoriteNums.add(0, 42);
        myFavoriteNums.add(1, 4);
        myFavoriteNums.add(myFavoriteNums.size(), 100);
        System.out.println(myFavoriteNums);
        System.out.println("size: " + myFavoriteNums.size());
        myFavoriteNums.add(2, 100);

        System.out.println("index of my num: " + myFavoriteNums.indexOf(24) );
        System.out.println("Where is this number? " + myFavoriteNums.get(2));
        System.out.println("Is this number there? " + myFavoriteNums.contains(42));
        System.out.println("What about this string? " + myFavoriteNums.contains("mcDezmone"));
        System.out.println();
        System.out.println(myFavoriteNums);
        System.out.println("last index: " + myFavoriteNums.lastIndexOf(100));

        System.out.println();
        myFavoriteNums.remove((Integer) 100);
        System.out.println("my 100 removed: " + myFavoriteNums);
        System.out.println("Remove 100 using index: " + myFavoriteNums.remove(4));
        System.out.println("new array; " + myFavoriteNums);
        System.out.println("I can also choose the number using .indexOf : " + myFavoriteNums.remove(myFavoriteNums.indexOf(2)));
        System.out.println(myFavoriteNums);


        System.out.println();
        System.out.println("*~*~*~*~*~ Hash Maps ~*~*~*~*~*");
        System.out.println();

        //HashMap<keyDatatype, valueDatatype> nameVar = new HashMap<>();

        HashMap<String, String> usernames = new HashMap<>();

        //Inserting k : v pairs into HashMap
        usernames.put("Kenneth", "ken2cool");
        usernames.put("Shanshan", "theGOAT");
        usernames.put("Cody", "codynotTheDuck");

        System.out.println("usernames.get(\"Shanshan\") = " + usernames.get("Shanshan"));

        //Oops: We looked for "Alex" as a key . . no results found :( we end up with a return of NULL
        System.out.println("usernames.get(\"Alex\") = " + usernames.get("Alex"));

        //Providing a default might be better:

        System.out.println("usernames.getOrDefault(\"Alex\", \"noUserFound\") = " + usernames.getOrDefault("Alex", "noUserFound"));

        //.contains with our above experimentation:

        System.out.println("usernames.containsKey(\"Alex\") = " + usernames.containsKey("Alex"));
        System.out.println("usernames.containsKey(\"Shanshan\") = " + usernames.containsKey("Shanshan"));
        System.out.println("usernames.containsValue(\"theGOAT\") = " + usernames.containsValue("theGOAT"));
        System.out.println("usernames.containsValue(\"aGoat\") = " + usernames.containsValue("aGoat"));
        System.out.println();

        System.out.println(usernames);

        usernames.putIfAbsent("Shanshan", "shanshan210");
        usernames.putIfAbsent("Alex", "majinAlex");

        System.out.println(usernames);

        System.out.println("usernames.getOrDefault(\"Alex\", \"noUserFound\") = " + usernames.getOrDefault("Alex", "noUserFound")); //expecting: I do have an "Alex" now, so I'm expecting majinAlex
        System.out.println("usernames.get(\"James\") = " + usernames.get("James"));
        System.out.println("usernames.getOrDefault(\"Fenix\", \"he's a dog\") = " + usernames.getOrDefault("html.input", "User not found")); //no key of "Fenix" - expecting: "he's a dog"

        System.out.println();
        System.out.println(usernames);
        usernames.remove("Alex");
        System.out.println(usernames);
        usernames.replace("Shanshan", "shanshan210");
        System.out.println(usernames);
        usernames.clear();
        System.out.println("usernames = " + usernames);
        System.out.println("usernames.getOrDefault(\"Shanshan\", \"are you there?\") = " + usernames.getOrDefault("Shanshan", "are you there?"));
        System.out.println("usernames.containsKey(\"Cody\") = " + usernames.containsKey("Cody"));
        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());






    }

}
