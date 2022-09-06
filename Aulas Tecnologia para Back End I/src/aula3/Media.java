package aula3;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.next();

        System.out.println("Digite sua primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("O nome informado é " + nome + "\nPrimeira nota: " + nota1 +
                "\nSegunda nota: " + nota2 + "\nSua média final é: " + media);

    }
}
