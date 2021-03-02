public class LeapYear {
    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            System.out.println("Invalid Value");
            return false;
        } else {
            boolean isDividedByFour = year % 4 == 0;
            boolean isDividedByOneHundred = year % 100 == 0;
            boolean isNotDividedByFourHundred = year % 400 != 0;

            return isDividedByFour
                    && !(isDividedByOneHundred && isNotDividedByFourHundred);
        }
    }
}