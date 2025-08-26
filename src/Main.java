import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        public class Main {
            public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);

                System.out.println("Enter number 1: ");
                double num1 = scn.nextDouble();

                System.out.println("Enter operation: ");
                char op = scn.next().charAt(0);

                System.out.println("Enter number 2: ");
                double num2 = scn.nextDouble();

                double result = 0;
                boolean isPossible = true;

                switch (op) {
                    case '+' -> result = num1 + num2;
                    case '-' -> result = num1 - num2;
                    case '*' -> result = num1 * num2;
                    case '/' -> {
                        if (num2 == 0) {
                            System.out.println("not possible");
                            isPossible = false;
                        } else {
                            result = num1 / num2;
                        }
                    }
                    case '%' -> result = num1 % num2;
                    default -> {
                        System.out.println("Invalid choice!!");
                        isPossible = false;
                    }
                }
            }
    }
}
