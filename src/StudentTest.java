public class StudentTest {
    public static void main(String[] args) {
        Student mcDezmone = new Student("mcDezmone mcMusgrove", "Quasar", 78.9);

        System.out.println("mcDezmone.grade = " + mcDezmone.shareGrade());

        Person guy = new Person("McGUYver");
        System.out.println(guy.getName());
    }
}
