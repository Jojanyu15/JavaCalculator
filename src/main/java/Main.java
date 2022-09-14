import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        BigInteger number1= scanner.nextBigInteger();
        System.out.print("Ingrese el segundo número: ");
        BigInteger number2= scanner.nextBigInteger();
        System.out.print("Ingrese el la operación que desea realizar [* / + -]: ");
        String operation = scanner.nextLine();
        BigInteger result;
        switch (operation){
            case "*":
                result = number1.multiply(number2);
                break;
            case "/":
                result = number1.divide(number2);
                break;
            case "+":
                result = number1.add(number2);
                break;
            case "-":
                result = number1.subtract(number2);
                break;
            default:
                throw new ArithmeticException();
        }
        System.out.println("El resultado de la operación es: " + result);
    }
}
