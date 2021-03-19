import javax.sound.midi.SysexMessage;

public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        String animal;
        int numberOfElements;

        animals[0] = "elephant";
        animals[1] = "giraffe";
        animals[2] = "monkey";
        animals[3] = "tiger";
        animals[4] = "zebra";
        animal = animals[3];
        numberOfElements = animals.length;

        System.out.print("My animal: ");
        System.out.println(animal);
        System.out.print("My array contains ");
        System.out.print(numberOfElements);
        System.out.println(" elements.");
    }
}
