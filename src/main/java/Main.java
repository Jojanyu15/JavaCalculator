import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int number1= scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int number2= scanner.nextInt();
        System.out.print("Ingrese el la operación que desea realizar [* / + -]: ");
        String operation = scanner.nextLine();
        int result;
        switch (operation){
            case "*":
                result = number1* number2;
                break;
            case "/":
                result = number1* number2;
                break;
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            default:
                break;
        }
    }
}
