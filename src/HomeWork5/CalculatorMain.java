package HomeWork5;

import org.w3c.dom.ls.LSOutput;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator part1 = new CalculatorWithOperator();
        double exp1 = part1.getMultiplication(15,7);

        CalculatorWithOperator part2 = new CalculatorWithOperator();
        double part4 = part2.getDivision(28,5);

        CalculatorWithOperator part3 = new CalculatorWithOperator();
        double exp2 = part3.getExponentiation(part4,2);


        System.out.println(exp1);
        System.out.println(part4);

        double res=4.1+exp1+exp2;
        System.out.println(res);


        System.out.println(res/0); // результат положительная бесконечность
        System.out.println(res/0.0d); // результат положительная бесконечность, так как используются числа с плавающей запятой

    }
}
