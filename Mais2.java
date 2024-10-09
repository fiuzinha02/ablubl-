import java.util.Scanner;

import static java.lang.System.out;

public class Mais2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

// primeiro pergunta o valor de A
        out.println("De o valor de A");
        a = sc.nextInt();
        //se for 0 então não faz nada
    if (a==0){
    out.println("Nao e equacao de segundo grau");
    }
    //MAS se não for então pergunta o valor de B e C
    else {
        System.out.println("De o valor de B");
        b = sc.nextInt();

        out.println("De o valor de C");
        c = sc.nextInt();
// faz o calculo de delta que é b²-4*a*c
        int delta = (b * b) - (4 * a * c);
        // se o valor desse calculo for negativo então diga isso e informe o valor de delta
        if (delta < 0) {
            out.println("A equacao nao possui raizes reais");
            out.println("Delta e igual a "+delta);
            // Mas se for positivo dar o valor dos dois x
        } else if (delta > 0) {
            double raizDelta = Math.sqrt(delta);
            double x1=(-b-raizDelta)/ (2*a);
            double x2=(-b+raizDelta)/(2*a);

            out.println("A equacao possui duas raizes reais");
            out.println(x1);
            out.println(x2);
        }
        // agora se delta for 0 então faça esse calculo
        else {
            double x = -b / (2.0*a);
            out.println("A equacao possui apenas uma raiz real");
            out.println("x = "+ x);
        }
    }
       sc.close();
    }
}
