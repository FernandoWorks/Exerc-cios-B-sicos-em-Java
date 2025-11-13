

package javaapplication1;
import java.util.Scanner;

public class Janela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int positivo = 0;
        int negativo = 0;

        System.out.println("Digite um número (0 para sair): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero < 0) {
                negativo++;
            } else if (numero > 0) {
                positivo++;
            }

           
            System.out.println("Digite outro número (0 para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
    }
}
