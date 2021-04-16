public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            System.out.println("Grades register is full. No more grades can be added.");
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (this.size > 0){
            return this.grades[this.size - 1];
        } else {
            System.out.println("Grades register is empty. There are no grades to return.");
            return -1;
        }
    }

    public double calculateAverage() {
        double average = 0;

        for (int i = this.size - 1; i >= 0; i--) {
            average = average + this.grades[i];
        }
        if (this.size > 0) {
            average = average / this.size;
            return average;
        } else {
            System.out.println("Grades register is empty. Average can't be calculated.");
            return -1.0;
        }
    }
}
