package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        // returns the student's name
        return this.name;
    }

    public void addGrade(int grade) {
        // adds the given grade to the grades property
        grades.add(grade);
    }

    public double getGradeAverage() {
        // returns the average of the students grades
        double gradeTotal = 0;
        for (double grade : this.grades) {
            gradeTotal += grade;

        }
        return (double) gradeTotal/this.grades.size();
    }

    public static void main(String[] args) {
        Student dez = new Student("Dez");
        Student doug = new Student("Doug E. Fresh");
        Student zay = new Student("Zavion");

        dez.addGrade(80);
        dez.addGrade(75);
        dez.addGrade(100);

        doug.addGrade(90);
        doug.addGrade(66);
        doug.addGrade(88);

        zay.addGrade(77);
        zay.addGrade(75);
        zay.addGrade(83);

        System.out.println("Dez Grades: " + dez.grades);
        System.out.println("Doug Grades: " + doug.grades);
        System.out.println("Zavion Grades: " + zay.grades);
        System.out.println();

        System.out.println("Dez GPA: " + dez.getGradeAverage());
        System.out.println("Doug GPA: " + doug.getGradeAverage());
        System.out.println("Zavion GPA: " + zay.getGradeAverage());
    }
}
