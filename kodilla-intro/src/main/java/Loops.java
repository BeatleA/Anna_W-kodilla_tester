public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int[] numbers = new int[] {1, 5, 3, 7};
        int sum;

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        sum = sumIntArray(numbers);
        System.out.print("The sum of all the numbers in the number array is: ");
        System.out.println(sum);

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static int sumIntArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
