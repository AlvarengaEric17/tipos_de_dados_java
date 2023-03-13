import java.util.Scanner;

public class mediaDeNotas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float n1, n2, media;

        String nome;

        System.out.print("Digite o nome do aluno: ");
        nome = input.next();

        System.out.println("Informe o valor da primeira nota: ");
        n1 = input.nextFloat();

        System.out.println("Informe o valor da segunda nota: ");
        n2 = input.nextFloat();

        media = (n1 + n2) / 2;

        if (media >= 8 && media <= 10) {

            System.out.print("A média do aluno " + nome + " é: " + media + " e o aluno foi aprovado");

        } else if (media >= 5 && media <= 7) {

            System.out.print("A média do aluno " + nome + " é: " + media + " e o aluno está de recuperação");

        }

        else if (media >= 0 && media <= 4) {

            System.out.print("A média do aluno " + nome + " é: " + media + " e o aluno foi reprovado");

        }

        else {

            System.out.print("ERRO NA MÉDIA");

        }
    }
}
