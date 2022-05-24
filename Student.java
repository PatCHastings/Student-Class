package Main;

public class Student {

    private String studentName;
    private String gradeLevel; // k-12; cant do int = k
    private char grade;
    private boolean graduated;

    public Student(String studentName, String gradeLevel, char grade, boolean graduated) {
    this.studentName = studentName;
    this.gradeLevel = gradeLevel;
    this.grade = grade;
    this.graduated = graduated;

    }

    public String getStudentName() { // you dont need them currently, its just common enough in case you were to eventually use them
        return studentName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public char getGrade() {
        return grade;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void nameGrade() {
        System.out.println("Students name is " + getStudentName() + " and his grade is " + getGrade());

    }

    public void grade() {
        System.out.println(grade);

    }

}
