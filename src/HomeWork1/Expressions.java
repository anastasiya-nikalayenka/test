package HomeWork1;

public class Expressions {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=8;
        int d=7;
        int f=20;
        int e=68;
        int g=22;
        int k=6;
        int l=3;
        int m=12;
        int n=119;

        boolean o = true;

        System.out.println("2.1 5+2/8= " + (a+b/c)); // результат = 5, 5 + 0 (в первую очередь выполняется деление, получается 0 так как у нас везде int)
        //System.out.println("float: 5+2/8= " + (a+ (float) b/c));

        System.out.println("2.2 (5+2)/8= " + ((a+b)/c)); // результат = 0, 7/8
        //System.out.println("float: (5+2)/8= " + ((float) (a+b)/c));

        System.out.println("2.3 (5+2++)/8= " + ((a+b++)/c)); // результат = 0, 7/8, b=3

        b=--b;

        //System.out.println("float: (5+2++)/8= " + ((float) (a+b++)/c));

        //b=--b;

        System.out.println("2.4 (5+2++)/--8= " + ((a+b++)/--c)); // результат = 1, 7/7, b=3

        b=--b;
        c=++c;


        //System.out.println("float: (5+2++)/--8= " + ((float) (a+b++)/--c));

        //b=--b;
        //c=++c;


        System.out.println("2.5 (5*2>>2++)/--8= " + ((a*b>>b++)/--c)); // (10>>2++)/7, 0001=1, 1/7=0 (int)

        b=--b;
        c=++c;

        //System.out.println("float: (5*2>>2++)/--8= " + ((float) (a*b>>b++)/--c));

        //b=--b;
        //c=++c;

        //System.out.println("a= " + a);
        //System.out.println("b= " + b);
        //System.out.println("с= " + c);

        System.out.println("2.6 (5+7>20?68>=68:22*2>>2++)/--8= " + ((a+d>f?e:g*b>>b++)/--c)); // (12>20 ? 68 : 44>>2++)/7, 44>>2, 11/7=1 (int)

        //System.out.println("b= " + b);
        //System.out.println("с= " + c);

        b=--b;
        c=++c;

        //System.out.println("float: (5+7>20?68>=68:22*2>>2++)/--8= " + ((float) (a+d>f?e:g*b>>b++)/--c));

        //b=--b;
        //c=++c;

        //System.out.println("2.7" + ((a+d>f?e>=e:g*b>>b++)/--c)); // / (12>20 ? 68>=68 : 44>> 2++)/7 получается если 12 > 20 то true если нет то число (ошибка компиляции из-за разных типов)

        o= -b>l&&m*m<=n;
        System.out.println("2.8 6-2>3&&12*12<=119= " + o); // 4>3&&144<=119, true&&false, 1&&0=0=false

        o= true&&false;
        System.out.println("2.9 true&&false= " + o); // true&&false, 1&&0=0=false


    }
}
