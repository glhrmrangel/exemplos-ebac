import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número de 3 dígitos:");
        int numeroExemplo = scanner.nextInt();
        System.out.println("Você escreveu: " + numeroExemplo);
        Integer numeroExemploWrap = numeroExemplo;
        System.out.println("Você escreveu: " + numeroExemploWrap);

    }

}
