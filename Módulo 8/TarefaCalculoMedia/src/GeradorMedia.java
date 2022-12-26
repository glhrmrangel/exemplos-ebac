/*
    @author: Guilherme Rangel
 */

import java.util.Scanner;

public class GeradorMedia {

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

    }
}
