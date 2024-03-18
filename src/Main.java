import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculation calculation = new Calculation();
        String expression;

        System.out.println("Введите выражение");

        expression = scanner.next();
        calculation.extraction(expression);
    }
}





