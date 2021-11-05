package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {
//        create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects
        HashMap<String, Student> students = new HashMap<>();

//        Create at least 4 Student objects
        Student dez = new Student("Dezmone");
        Student chuck = new Student("Charles");
        Student dick = new Student("Richard");
        Student bill = new Student("William");


//        for (individual : students)
//    with at least 3 grades each, and add them to the map.
        //dez
        dez.addGrade(80);
        dez.addGrade(75);
        dez.addGrade(100);
        System.out.println("Dez's GPA: " + dez.getGradeAverage());

        //chuck
        chuck.addGrade(65);
        chuck.addGrade(72);
        chuck.addGrade(95);
        System.out.println("Chuck's GPA: " + chuck.getGradeAverage());


        //dick
        dick.addGrade(100);
        dick.addGrade(100);
        dick.addGrade(33);
        System.out.println("Dick's GPA: " + dick.getGradeAverage());

        //bill
        bill.addGrade(69);
        bill.addGrade(70);
        bill.addGrade(71);
        System.out.println("Bill's GPA: " + bill.getGradeAverage());
        System.out.println();

        //add Github usernames
        students.put("Dezmonelm", dez);
        students.put("Chuck-E-Charles" , chuck);
        students.put("Rich-Da-Kid" , dick);
        students.put("Will.I.Am" , bill);

        System.out.println("Github usernames:");
        System.out.println(students.keySet());
        System.out.println();


        for(Map.Entry<String, Student> entry : students.entrySet()){
            String key = entry.getKey();
            Student studentObj = entry.getValue();

//            System.out.println(entry);
            System.out.printf("The student's username is %s and the student's name is %s%n", key, studentObj.getName());


        }

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println("|Chuck-E-Charles| |Rich-Da-Kid| |Will.I.Am| |Dezmonelm| ");
        System.out.println("What student would you like to see more information on?\n");
        boolean confirm;
        do {System.out.println("Search by Github username:\n");
            Input input = new Input();
            String userString = input.getString();
            System.out.println(userString);
            if (students.containsKey(userString)) {
                System.out.println("Name: " + students.get(userString).getName() + "\nCurrent Average: " + students.get(userString).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userString + ".");
//            System.out.println(students.putIfAbsent(userString, students.getOrDefault((userString).getClass()),"Sorry, no student found with the GitHub username of " + userString + ".") );
            }
            System.out.println("Would you like to see another student? (y/n)");
            confirm = input.getString().equalsIgnoreCase("y");
        } while (confirm);

        System.out.println("Goodbye, and have a wonderful day!");


//
//
//
//> pizza
//
//        "pizza".
//
//                Would you like to see another student?
//
//> y
//
//        What student would you like to see more information on?
//
//> zgulde
//
//        Name: Zach - GitHub Username: zgulde
//        Current Average: 87.4
//
//        Would you like to see another student?
//
//> no
//
//        Goodbye, and have a wonderful day!

    }



}
