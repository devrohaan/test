import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Select Operation (+, -, *): ");
        char operation = reader.next().charAt(0);
        double result;
        switch(operation)
        {
            case '+':
                System.out.println("Result: " + (first + second));
                break;
            case '/':
                System.out.println("Result: " + (first / second));
                break;
            case '-':
                System.out.println("Result: " + (first - second));
                break;
            case '*':
                System.out.println("Result: " + (first * second));
                break;
            default:
                System.out.println("Error! Operation is not correct");
                return;
        }
    }
}
