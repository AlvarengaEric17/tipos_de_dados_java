import java.util.Scanner;

public class mediaDeNotas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n1, n2, media;

        System.out.println("Informe o valor da primeira nota: ");
        n1 = input.nextInt();

        System.out.println("Informe o valor da segunda nota: ");
        n2 = input.nextInt();

        media = (n1 + n2) / 2;

    }

}
