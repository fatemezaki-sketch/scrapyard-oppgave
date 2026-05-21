public class Main {
    public static void main(String[] args) {
        double[] grades1 = {75, 80, 68, 90};
        double[] grades2 = {40, 45, 50, 38};
        double[] grades3 = {95, 88, 92, 85};

        Student student1 = new Student("Sara", 1001, grades1);
        Student student2 = new Student("Ali", 1002, grades2);
        Student student3 = new Student("Nora", 1003, grades3);

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}