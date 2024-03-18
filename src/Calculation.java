
public class Calculation {
    Roman roman = new Roman();

    public void extraction(String expression) {
        int firstOperand;
        int secondOperand;
        int result;
        String operator;
        String[] operandsOfExpression;

        if (expression.charAt(0) == '-') {
            throw new RuntimeException("Числа должны быть от 1 до 10");
        }
        operandsOfExpression = expression.split("[+\\-*/]");
        if (operandsOfExpression.length > 2) {
            throw new RuntimeException("Должно быть 2 операнда");
        }

        operator = getOperatorFromExpression(expression);
        if (operator==null) {
            throw new RuntimeException("Не является математическим выражением");
        }

        if (roman.checkRomanNumbers(operandsOfExpression[0]) && roman.checkRomanNumbers(operandsOfExpression[1])) {
            firstOperand = roman.converterFromRomanToArabic(operandsOfExpression[0]);
            secondOperand = roman.converterFromRomanToArabic(operandsOfExpression[1]);
            if ((firstOperand > 10 || firstOperand == 0) || (secondOperand > 10 || secondOperand == 0)) {
                throw new RuntimeException("Числа должны быть от 1 до 10");
            }
            result = calc(operator, firstOperand, secondOperand);
            if (result < 0) {
                throw new RuntimeException("В Римской системе счисления нет отрицательных чисел");
            } else {
                System.out.println(roman.fromArabicToRoman(firstOperand) + operator + roman.fromArabicToRoman(secondOperand) + "=" + roman.fromArabicToRoman(result));
            }
        }


        if (roman.checkRomanNumbers(operandsOfExpression[0]) && !roman.checkRomanNumbers(operandsOfExpression[1])) {
            throw new RuntimeException("Должно быть либо 2 арабских числа, либо 2 римских исла ");
        }


        if (!roman.checkRomanNumbers(operandsOfExpression[0]) && roman.checkRomanNumbers(operandsOfExpression[1])) {
            throw new RuntimeException("Должно быть либо 2 арабских числа, либо 2 римских исла ");
        }


        if (!roman.checkRomanNumbers(operandsOfExpression[0]) && !roman.checkRomanNumbers(operandsOfExpression[1])) {
            firstOperand = Integer.parseInt(operandsOfExpression[0]);
            secondOperand = Integer.parseInt(operandsOfExpression[1]);
            if ((firstOperand > 10 || firstOperand == 0) || (secondOperand > 10 || secondOperand == 0)) {
                throw new RuntimeException("Числа должны быть от 1 до 10");
            }
            System.out.println(firstOperand + operator + secondOperand + "=" + calc(operator, firstOperand, secondOperand));
        }


    }


    private int calc(String operator, int firstOperand, int secondOperand) {
        int result = 0;
        switch (operator){
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            default:break;
        }
        return result;

    }

    private static String getOperatorFromExpression(String expression) {
        String operation = null;
        if (expression.contains("-")) {
            operation = "-";
        }
        if (expression.contains("+")) {
            operation = "+";
        }
        if (expression.contains("/")) {
            operation = "/";
        }
        if (expression.contains("*")) {
            operation = "*";
        }
        return operation;
    }

}
