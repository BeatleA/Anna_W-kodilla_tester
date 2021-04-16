public class TestGrades {
    public static void main(String[] args) {
        Grades grades = new Grades();

        System.out.println("Last grade: " + grades.getLastGrade());
        System.out.println("Average: " + grades.calculateAverage());
        grades.add(5);
        System.out.println("Last grade: " + grades.getLastGrade());
        grades.add(3);
        System.out.println("Last grade: " + grades.getLastGrade());
        grades.add(4);
        System.out.println("Last grade: " + grades.getLastGrade());
        System.out.println("Average: " + grades.calculateAverage());
        for (int i = 0; i < 10; i++) {
            grades.add(i+5);
            System.out.println("Last grade: " + grades.getLastGrade());
        }
        System.out.println("Average: " + grades.calculateAverage());
    }
}
