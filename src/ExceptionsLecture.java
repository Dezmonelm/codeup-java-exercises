public class ExceptionsLecture {

    public static void main(String[] args)  throws Exception {

        System.out.println("Hello World");

        try {
            throw new Exception("Hey, something bad happened.");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
