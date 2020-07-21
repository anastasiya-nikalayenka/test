package HomeWork5;

public class CalculatorWithOperator {


    public double getAddition(double a,double b) {
        return a+b;
    }

    public double getSubtraction(double a,double b) {
        return a-b;
    }

    public double getMultiplication(double a,double b) {
        return a*b;
    }

    public double getDivision(double a,double b) {
        return a/b;
    }

    public int getMod(int a){
        if (a>=0) {
            return a;
        } else {
            return -1*a;
        }
    }

    public double getExponentiation(double x,int n) {
        int res=1;
        for(int i=0;i<n;i++){
            res*=x;
        }
        return res;
    }

}
