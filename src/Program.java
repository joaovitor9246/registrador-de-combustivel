import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        char finalizar;

        do {

            do {
                System.out.println("|------------- Tipos de combustível ------------|");
                System.out.println("   1 - Àlcool");
                System.out.println("   2 - Gasolina");
                System.out.println("   3 - Diesel");
                System.out.println("|-----------------------------------------------|");

                System.out.println("            ");
                System.out.println("Digite o tipo de combustível que você dejesa: ");
                tipo = sc.nextInt();

                if (tipo < 1 || tipo > 3){
                    System.out.println("Você escolheu um tipo inválido, tente novamente.");
                }

            } while (tipo < 1 || tipo > 3);

            if(tipo == 1){
                alcool ++;
                System.out.println("Você escolheu álcool");
            } else if (tipo == 2) {
                gasolina ++;
                System.out.println("Você escolheu Gasolina");
            } else {
                diesel ++;
                System.out.println("Você escolheu Diesel");
            }

            System.out.println("Você deseja encerrar o registrador ? (S/N)");
            finalizar = sc.next().charAt(0);
            finalizar = Character.toUpperCase(finalizar);

        } while(finalizar == 'N');

        System.out.println("MUITO OBRIGADO !!!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
