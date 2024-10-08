import java.util.Scanner;

public class quase {
    public static void main(String[] args) {
        int primNum,segNum,terNum;
            Scanner sc = new Scanner(System.in);
//Solicitar três números do úsuario//
            System.out.println("Primeiro numero");
            primNum=sc.nextInt();

            System.out.println("Segundo numero");
            segNum=sc.nextInt();

            System.out.println("Terceiro numero");
            terNum=sc.nextInt();
/**
 * Essa função é responsável por retornar a soma de dois valores de número inteiro
 * @param primNum primeiro número inteiro
 * @param segNum segundo número inteiro
 * @param terNum terceiro número inteiro
 */

        if (primNum+segNum>terNum) {
            System.out.println(primNum+segNum);
            System.out.println("E maior que o terceiro");
        }
        //Avisar se a soma dos dois números é maior ou menor que o terceiro número
        else if (primNum+segNum<terNum) {
            System.out.println(primNum+segNum);
            System.out.println("E menor que o terceiro");
        }
    }
}
