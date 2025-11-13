

package javaapplication1;
import java.util.Scanner;


public class numeros_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroFinal;
        
        System.out.print("Digite um número final: ");
        numeroFinal = sc.nextInt();
        
        System.out.println("Números pares de 1 até " + numeroFinal + ":");
        
        for (int i = 1; i <= numeroFinal; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
       
    }
}