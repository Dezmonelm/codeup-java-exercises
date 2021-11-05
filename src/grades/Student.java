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
        for (double grade : grades) {
            gradeTotal += grade;

        }
        return (double) gradeTotal/grades.size();
    }

    public static void main(String[] args) {
        Student dez = new Student("Dez");
        dez.addGrade(80);
        dez.addGrade(75);
        dez.addGrade(100);
        System.out.println("Dez GPA: " + dez.getGradeAverage());

    }
}
