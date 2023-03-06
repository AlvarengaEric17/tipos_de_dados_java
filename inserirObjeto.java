import java.util.Scanner;

import javax.sql.rowset.BaseRowSet;

public class inserirObjeto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base, altura, area;

        System.out.println("Informe o valor da base: ");
        base = input.nextInt();

        System.out.println("Informe o valor da altura: ");
        altura = input.nextInt();

        area = base * altura;

        System.out.printf("A área de um retangulo = " + base);
        System.out.printf("\n é a altura de = " + altura);
        System.out.printf("\n é = " + area + "\n");

    }

}
