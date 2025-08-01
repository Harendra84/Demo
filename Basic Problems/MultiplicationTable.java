public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 5;
        System.out.println("MMultiplication Table for " + number + " : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}