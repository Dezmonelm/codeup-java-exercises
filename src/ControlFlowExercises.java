import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        boolean isSunny = false;
//        boolean hasUmbrella = true;
//
//        if (isSunny) {
//            System.out.println("yay");
//        } else if (!isSunny && hasUmbrella) {
//            System.out.println("might be a bad day");
//        } else {
//            System.out.println("go look at the weather");
//        }

//        int caseSwitch = 3;
//
//        switch (caseSwitch){
//            case 1:
//                System.out.println("Case 1");
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//        }

//        for (int i = 1; i < 100; i++){
//            System.out.println(i);
//            if (i == 15){
//                break;
//            }
//        }

        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x+= 2;
        } while (x <=100);

        int y = 100;

        do {
            System.out.println(y + " ");
            y -= 5;
        } while (y >= -10);

         long z = 2;


        do {
            System.out.println(z);
            z *= z;
        } while (z <= 1000000);

        for (int a = 0; a <=100; a+= 2){
            System.out.println(a);
        }

        for (long b = 2; b <= 1000000; b*= b) {
            System.out.println(b);
        }

        for (int fb = 1; fb <= 100; fb++) {
            if (fb % 3 == 0 && fb % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (fb % 5 == 0) {
                System.out.println("Buzz");
            } else if(fb % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(fb);
            }
        }

        Scanner controlScanner = new Scanner(System.in);

        boolean confirm;
        do {
            System.out.println("Enter an integer: ");
            int userNum = controlScanner.nextInt();
            System.out.println("Here is your table!");

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------ | ------");

            for (int g = 1; g <= userNum; g++) {
                System.out.printf("%-7d|%-9d|%-6d\n", g, g * g, g * g * g);
            }
            System.out.println("Do you want to continue? (Y/N) ");
            confirm = controlScanner.next().equalsIgnoreCase("y");
        } while(confirm);






        do {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            int userNumber = controlScanner.nextInt();
            if (100 <= userNumber && userNumber >= 88) {
                System.out.println("A");
            } else if (87 <= userNumber && userNumber >= 80) {
                System.out.println("B");
            } else if (79 <= userNumber && userNumber >= 67) {
                System.out.println("C");
            } else if (66 <= userNumber && userNumber >= 60) {
                System.out.println("D");
            } else if (59 <= userNumber && userNumber >= 0) {
                System.out.println("F");
            } else {
                System.out.println("Actually do some work!");
            }

            System.out.println("Do you want to continue? (Y/N) ");
            confirm = controlScanner.next().equalsIgnoreCase("y");
        } while (confirm);

    }
}
