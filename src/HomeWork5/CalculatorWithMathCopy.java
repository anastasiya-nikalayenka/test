package HomeWork5;


public class CalculatorWithMathCopy {
    public double getAddition(double a,double b) {
        return a+b;
    }

    public double getSubtraction(double a,double b) {
        return a-b;
    }

    public double getMultiplication(double a,double b) { return a*b; }

    public double getDivision(double a,double b) {
        return a/b;
    }

    public int getMod(int a){
        return Math.abs(a);
    }

    public double getExponentiation(double x,int n) {
        return Math.pow(x,n);
    }
}
