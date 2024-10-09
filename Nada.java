import java.util.Scanner;
public class Nada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,s,e,v;
        int a = 0;
        System.out.println("Vamos fazer o seu registro ;)");

        System.out.println("Nome completo");
        n=sc.nextInt();
/**
 * @param n O nome será atribuido
 * @param s a escolha entre feminino 1 e masculino 2
 * @param e o estado civil se é casado solteiro ou viuvo
 */
        System.out.println("Sexo");
        System.out.println("1-Feminino/2-Masculino");
        s=sc.nextInt();

        System.out.println("Estado Civil");
        System.out.println("1-Casado(a)/2-Solteiro(a)/Viuvo(a)");
        e=sc.nextInt();
/**
 * se s for igual a 1 ou seja feminino
 * e se e for igual a 1 ou seja casada
 * pergunta quantos anos é casada
 * @param a anos casada
 */
        if (s==1 &&  e==1){
            System.out.println("Quantos anos a senhora é casada?");
            a=sc.nextInt();
        }
        // se for viuvo(a) diga meus pesames
        if (e==3){
            System.out.println("Meus pesames");
        }
        //se os anos de casada são 1 fala isso
        if(a==1){
            System.out.println("Casou recentemente ;)");
        }
sc.close();
    }


}


