public class Hello {

    // public - An access modifier
    // static -
    // void - Indicates that the method will not return anything

    // main() - A method declaration; parameters are inside the parentheses

    // Statement - Complete command to be executed and can include one or more expressions

    // Variables - A way to store information in our computer. Variables defined in a program can be accessed by a name,
    // and the computer figures out where they are stored in RAM.

    public static void main(String[] args) {
        System.out.println("Hello, Jared");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
