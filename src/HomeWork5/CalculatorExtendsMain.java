package HomeWork5;

public class CalculatorExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends part1 = new CalculatorWithMathExtends();
        double exp1 = part1.getMultiplication(15,7);

        CalculatorWithMathExtends  part2 = new CalculatorWithMathExtends ();
        double part4 = part2.getDivision(28,5);

        CalculatorWithMathExtends  part3 = new CalculatorWithMathExtends ();
        double exp2 = part3.getExponentiation(part4,2);


        System.out.println(exp1);
        System.out.println(part4);

        double res=4.1+exp1+exp2;
        System.out.println(res);


        System.out.println(res/0); // результат положительная бесконечность
        System.out.println(res/0.0d); // результат положительная бесконечность, так как используются числа с плавающей запятой

    }
}
