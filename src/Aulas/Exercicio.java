package Aulas;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" >>>>> Cardapio <<<<<");

        System.out.println(" 1 sanduiche natureba");
        System.out.println(" 2 Sanduba Bomba");
        System.out.println(" 3 Coxinha de Jaca");
        System.out.println(" 4 Feijoada vegetariana");

        System.out.println("Digite o numero da opcao desejada ");
        int num = sc.nextInt();


        switch (num){

            case 1:
                System.out.println(" Voce escolheu o Sanduiche natureba ");
                break;

            case 2:
                System.out.println(" Voce escolheu o Sanduba Bomba ");
                break;
            case 3:
                System.out.println(" Voce escolheu o Coxinha de Jaca ");
                break;
            case 4:
                System.out.println(" Voce escolheu o Feijoada vegetariana ");
                break;

            default:
                System.out.println("Essa opcao nao existe");

        }

        System.out.println(" Quantidade : ");
        int quantidade = sc.nextInt();

       switch (quantidade){
add
           case 1:
               System.out.println("Boa merenda ");
               break;

           default:
               System.out.println("Voce so pode pegar um lanche ");
       }




    }



}
