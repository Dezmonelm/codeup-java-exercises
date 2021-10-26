public class StringExercise {
    public static void main(String[] args) {


//        For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.
        String education = "We don't need no education We don't need no thought control";
        System.out.println(education.substring(0, 26) + "\n" + education.substring(27));

        System.out.println();
        String checking = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(checking);

        System.out.println();
        String windowsPC = "In windows, the main drive is usually C:\\";
        System.out.println(windowsPC);

        System.out.println();
        String backSlash = "I can do backslashes \\, double backslashes \\\\,";
        System.out.println(backSlash);
    }
}
