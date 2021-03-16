public class LeapYear {
    public static void main(String[] args) {
        int year = 2021;
        boolean isLeapYear = leapYear(year);

        System.out.print(year);
        if (isLeapYear) {
            System.out.println(" is a leap year.");
        } else {
            System.out.println(" isn't a leap year.");
        }
    }

    private static boolean leapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
