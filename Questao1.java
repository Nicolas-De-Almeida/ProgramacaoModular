
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("IDk:?");
        int fatorial = entrada.nextInt();
        int total = 1;
        for (int i = 1; i <= fatorial; i++) {
            total *= i;
        }
        System.out.println("Resultado: " + total);
    }


}