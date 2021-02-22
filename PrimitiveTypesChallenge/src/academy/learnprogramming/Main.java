package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Challenge: Create a byte variable and set it to any valid byte number. Create a short variable and set it
        // to any valid short number. Create an int variable and set it to any valid int number. Lastly, create a
        // variable of type long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the
        // integer values.

        byte byteValue = 30;
        short shortValue = 12000;
        int intValue = 140000;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
    }
}
