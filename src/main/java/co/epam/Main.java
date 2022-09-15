package co.epam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.math.BigInteger;
import java.util.Scanner;

@SpringBootApplication
public class Main extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        BigInteger number1= scanner.nextBigInteger();
        System.out.print("Ingrese el segundo número: ");
        BigInteger number2= scanner.nextBigInteger();
        System.out.print("Ingrese el la operación que desea realizar [* / + -]: ");
        String operation = scanner.next();
        BigInteger result;
        switch (operation){
            default:
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
        }
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Main.class);
    }
}
