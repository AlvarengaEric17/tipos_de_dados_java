import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Informe um valor: ");
        number = input.nextInt();

        if (number > 0) {

            System.out.print("O numero " + number + " é positivo \n");

        } else if (number == 0) {

            System.out.print("O numero " + number + " é nulo \n");

        }else if (number < 0){

            System.out.print("O numero " + number + " é negativo \n");

        }else{
            System.out.print("ERRO");
        }

    }
}
