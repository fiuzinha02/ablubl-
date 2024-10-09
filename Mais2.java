import java.util.Scanner;

import static java.lang.System.out;

public class Mais2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;


        out.println("De o valor de A");
        a = sc.nextInt();
    if (a==0){
    out.println("Nao e equacao de segundo grau");
    }
    else {
        System.out.println("De o valor de B");
        b = sc.nextInt();

        out.println("De o valor de C");
        c = sc.nextInt();

        int delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            out.println("A equacao nao possui raizes reais");
            out.println("Delta e igual a "+delta);
        } else if (delta > 0) {
            double raizDelta = Math.sqrt(delta);
            double x1=(-b-raizDelta)/ (2*a);
            double x2=(-b+raizDelta)/(2*a);

            out.println("A equacao possui duas raizes reais");
            out.println(x1);
            out.println(x2);
        }
        else {
            double x = -b / (2.0*a);
            out.println("A equacao possui apenas uma raiz real");
            out.println("x = "+ x);
        }
    }
       sc.close();
    }
}
