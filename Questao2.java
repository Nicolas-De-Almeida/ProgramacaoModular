import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] vetor = new int[3];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite seu número: ");
            int numero = entrada.nextInt(); 
            vetor[i] = numero;
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] >= maior) {
                maior = vetor[i];
            }
            if (vetor[i] <= menor) {
                menor = vetor[i];
            } 
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        if(vetor[1] <= vetor[2]) { 
            if (vetor[1] <= vetor[0] && vetor[0] <= vetor[2]) {
                System.out.println("O número " + vetor[0] + " está dentro do intervalo [" + vetor[1] + "," + vetor[2] + "].");
            } else {
                System.out.println("O número " + vetor[0] + " não está dentro do intervalo [" + vetor[1] + "," + vetor[2] + "].");

            }
        } else {
            System.out.println("Intervalo inválido");
        }

        if (vetor[1] != 0 && vetor[2] != 0) {
            if (vetor[0] % vetor[1] == 0) {
                System.out.println("O número " + vetor[0] + " é divisível por " + vetor[1]);
            } else {
                System.out.println("O número " + vetor[0] + " não é divisível por " + vetor[1]);

            }
            if (vetor[0] % vetor[2] == 0) {
                System.out.println("O número " + vetor[0] + " é divisível por " + vetor[2]);
            } else {
                System.out.println("O número " + vetor[0] + " não é divisível por " + vetor[2]);

            }
        } else {
            System.out.print("Não é possivel fazer a divisão com (0)!");
        }
    }
}
