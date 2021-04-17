import java.util.Random;

public class RandomNumbers {
    private int maxRandomValue = -1;
    private int minRandomValue = -1;

    public int getMaxRandomValue(){
        return maxRandomValue;
    }

    public int getMinRandomValue(){
        return minRandomValue;
    }

    public void draw(){
        Random random = new Random();
        int sum = 0;
        int number = 0;

        System.out.println("Random numbers in range 0-30:");
        while (sum < 5000) {
            number = random.nextInt(30);
            System.out.print(number + ", ");
            sum = sum + number;
            if (isMaxValue(number)) {
                maxRandomValue = number;
            }
            if (isMinValue(number)) {
                minRandomValue = number;
            }
        }
        System.out.println("\nSum: " + sum);
   }

    private boolean isMaxValue(int value){
        if (maxRandomValue == -1 || maxRandomValue < value) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isMinValue(int value){
        if (minRandomValue == -1 || minRandomValue > value) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        RandomNumbers random = new RandomNumbers();
        int maxRandomValue;
        int minRandomValue;

        random.draw();
        maxRandomValue = random.getMaxRandomValue();
        minRandomValue = random.getMinRandomValue();
        System.out.println("The largest random number drawn: " + maxRandomValue);
        System.out.println("The smallest random number drawn: " + minRandomValue);
    }
}
