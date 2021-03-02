public class Main {

    public static void main(String[] args) {

        boolean testOne = EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(testOne);

        boolean testTwo = EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(testTwo);

        boolean testThree = EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(testThree);
    }
}
