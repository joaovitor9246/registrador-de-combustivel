import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("|------------- Números para cada tipo de combustíveis ------------|");
        System.out.println("   1 - Àlcool");
        System.out.println("   2 - Gasolina");
        System.out.println("   3 - Diesel");
        System.out.println("|------------------------------------------------------------------|");

        System.out.println("            ");
        System.out.println("Digite o tipo de combustível que você dejesa");
        int tipo = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(tipo != 4){
            if(tipo == 1){
                alcool += 1;
                System.out.println("Você escolheu álcool");
            } else if (tipo == 2) {
                gasolina += 1;
                System.out.println("Você escolheu Gasolina");
            } else if (tipo == 3) {
                diesel += 1;
                System.out.println("Você escolheu Diesel");
            }
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO !!!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
