package aula3;

import java.util.Scanner;

public class CadastroDeEstudante {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome do Estudante: ");
        String nome = ler.next();

        System.out.println("Endereço: ");
        String endereco = ler.next();

        System.out.println("Curso: ");
        String curso = ler.next();

        System.out.println("Idade: ");
        int idade = ler.nextInt();

        System.out.println("O nome informado é " + nome + "\nEndereço: " + endereco +
                "\nCurso: " + curso + "\nIdade: " + idade);

        if(idade < 18) {
            System.out.println("Por favor, se dirigir à secretaria e preencher declaração com assinatura do responsável.");
        } else {
            System.out.println("Estudante cadastrado com sucesso!");
        }
    }
}
