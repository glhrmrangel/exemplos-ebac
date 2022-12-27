import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota:");
        int primeiraNota = scanner.nextInt();

        System.out.println("Insira a segunda nota:");
        int segundaNota = scanner.nextInt();

        System.out.println("Insira a terceira nota:");
        int terceiraNota = scanner.nextInt();

        System.out.println("Insira a quarta nota:");
        int quartaNota = scanner.nextInt();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4.0;

        System.out.println("A média é: " + media);

        if (media < 5){
            System.out.println("Infelizmente você foi reprovado.");
        } else if (media < 7) {
            System.out.println("Você precisará fazer a recuperação.");
        } else {
            System.out.println("Aprovado! Parabéns!");
        }

    }
}
