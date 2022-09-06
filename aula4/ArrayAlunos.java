package aula4;

public class ArrayAlunos {
    public static void main(String[] args) {

        String[] alunos = new String[7];

        alunos[0] = "Ewerton";
        alunos[1] = "Enzo";
        alunos[2] = "Matteo";
        alunos[3] = "Luan";
        alunos[4] = "Hugo";
        alunos[5] = "Wagner";
        alunos[6] = "Carlos";

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

    }
}
