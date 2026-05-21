public class Student {
    private String name;
    private int studentId;
    private double[] grades;

    public Student(String name, int studentId, double[] grades) {
        this.name = name;
        this.studentId = studentId;
        this.grades = grades;
    }

    public double calculateAverage() {
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public boolean hasPassed() {
        return calculateAverage() >= 50;
    }

    public void printStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Average grade: " + calculateAverage());

        if (hasPassed()) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        System.out.println("----------------------");
    }
}
