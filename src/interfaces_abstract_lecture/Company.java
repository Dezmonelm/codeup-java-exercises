package interfaces_abstract_lecture;

import java.sql.SQLOutput;

public class Company { // Good ol' Boys INC

    public static void main(String[] args) {
//        Accountant accountantBot = new Accountant("NumberBot", "Accounting");
//        Custodian cleanerBot = new Custodian(
//                "cleanerBot9000", "Maintenance");

        // both top and bottom work

        //polymorphism
        Employee accountantBot = new Accountant("NumberBot", "Accounting");
        Employee cleanerBot = new Custodian(
                "cleanerBot9000", "Maintenance");

//        System.out.println(accountantBot.work());
//        System.out.println(accountantBot.getName());
//        System.out.println(accountantBot.getDepartment());
//        System.out.println();
//
//        System.out.println(cleanerBot.work());
//        System.out.println(cleanerBot.getName());
//        System.out.println(cleanerBot.getDepartment());

        //How does our work day go?

        System.out.println(accountantBot.getName() + " is reporting to business for the " + accountantBot.getDepartment());
        System.out.println(cleanerBot.getName() + " is reporting to business for the " + cleanerBot.getDepartment());

        System.out.println();
        System.out.println("How do morning meetings go?");
        System.out.println("accountantBot = " + accountantBot.morningMeeting());
        System.out.println("cleanerBot = " + cleanerBot.morningMeeting());

        System.out.println();
        System.out.println("What happened at lunchtime?");
        System.out.println("accountantBot = " + accountantBot.lunchTime());
        System.out.println("cleanerBot = " + cleanerBot.lunchTime());

        System.out.println();
        System.out.println("What kind of work do they do?");
        System.out.println("accountantBot = " + accountantBot.work());
        System.out.println("cleanerBot = " + cleanerBot.work());

        System.out.println();
        System.out.println("How much did they earn today?");
        System.out.println("accountantBot = " + accountantBot.dailyPay());
        System.out.println("cleanerBot = " + cleanerBot.dailyPay());
    }
}
