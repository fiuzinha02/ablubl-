import java.util.Scanner;
public class Nada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,s,e,v;
        int a = 0;
        System.out.println("Vamos fazer o seu registro ;)");

        System.out.println("Nome completo");
        n=sc.nextInt();

        System.out.println("Sexo");
        System.out.println("1-Feminino/2-Masculino");
        s=sc.nextInt();

        System.out.println("Estado Civil");
        System.out.println("1-Casado(a)/2-Solteiro(a)/Viuvo(a)");
        e=sc.nextInt();

        if (s==1 &&  e==1){
            System.out.println("Quantos anos a senhora é casada?");
            a=sc.nextInt();
        }
        else if (s==2 &&  e==2){
            a=0;
        }
        if (e==3){
            System.out.println("Meus pesames");
        }
        if(a==1){
            System.out.println("Casou recentemente ;)");
        }

    }


}


