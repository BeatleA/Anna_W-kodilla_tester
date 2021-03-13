public class MainExtended {
    public static void main(String[] args) {
        String nurseryRhyme1 = "There were ";
        String nurseryRhyme2 = " in the bed and the little one said 'Roll over! Roll over!'";
        String nurseryRhyme3 = "So they all rolled over and one fell out...";
        String nurseryRhyme4 = "There was 1 in the bed and the little one said 'Good night!'";
        int bedCount = 5;
        boolean isTooHigh = (bedCount>1);

        while (isTooHigh) {
            System.out.print(nurseryRhyme1);
            System.out.print(bedCount);
            System.out.println(nurseryRhyme2);
            System.out.println(nurseryRhyme3);
            System.out.println();
            bedCount--;
            isTooHigh = (bedCount>1);
        }
        System.out.println(nurseryRhyme4);
    }
}
