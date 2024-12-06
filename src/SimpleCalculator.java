import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                //get first number
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                //get operator
                System.out.print("Enter an operator (+, -, *, /, %): ");
                char operator = scanner.next().charAt(0);

                //get second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                //perform calculation
                double result = 0;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                    default:
                        System.out.println("Error: Invalid operator!");
                        continue;
                }

                //display result
                System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);

                //ask if user wants to continue
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String continueCalc = scanner.next();
                if (!continueCalc.toLowerCase().equals("yes")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please try again.");
                scanner.nextLine(); //clear the invalid input
            }
        }

        System.out.println("Calculator closed.");
    }
}
