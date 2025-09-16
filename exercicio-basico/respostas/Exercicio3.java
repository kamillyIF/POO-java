package respostas;
//Crie um programa que receba um valor inteiro do usuário, use a classe Integer para convertê-lo
// em uma representação binária, octal e hexadecimal, e imprima os resultados.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        String binario = Integer.toBinaryString(numero); // Esse toBinary... Converte o número inteiro
                                                        // para uma representação binária.
        String octal = Integer.toOctalString(numero);
        String hexadecimal = Integer.toHexString(numero);

        System.out.println("Representação binária: " + binario);
        System.out.println("Representação octal: " + octal);
        System.out.println("Representação hexadecimal: " + hexadecimal);
    }
}
