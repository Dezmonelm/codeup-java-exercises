import org.w3c.dom.ls.LSOutput;

public class Student {

    public String name;
    public String cohort;
    private double grade;

    // Now let's add a cohort - a method for object creation

    public Student(String studentName) {
//        this.name = studentName;
//        this.cohort = "Unassigned";

//     ^ same as bellow

    //calling constructor inside a constructor
    this(studentName, "Unassigned");
    }
    public Student(String studentName, String studentCohort, double grade) {
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;
    }
    public Student(String studentName, String studentCohort) {
        this.name = studentName;
        this.cohort = studentCohort;
    }

    public double shareGrade()  {
        return grade;
    }

    public static void main(String[] args) {
        //Before constructors: [similar feel to JS]
//        Student mcStudent = new Student();
//        mcStudent.name = "Ronald";
//        mcStudent.cohort = "Golden Arches";
//
//        System.out.println(mcStudent.name + " is in the " + mcStudent.cohort + " cohort");
        //first try
        Student shanshan = new Student("Shanshan S.");
        System.out.println("shanshan.name = " + shanshan.name + "shanshan.cohort =" + shanshan.cohort);

//        second
        Student dezmone = new Student("Dezmone M.", "Quasar");

        System.out.printf("%s is the student name and %s is their assigned cohort", dezmone.name, dezmone.cohort);


    Student mcDezmone = new Student("mcDezmone mcMusgrove", "mcQuasar", 78.9);

        System.out.println("mcDezmone.grade = " + mcDezmone.grade);
    }
}
