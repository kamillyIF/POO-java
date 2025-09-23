package respostas;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        Integer n1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        Integer n2 = sc.nextInt();

        System.out.println("Com == : " + (n1 == n2)); // o == compara dentro do -128 a 127
        System.out.println("Com equals : " + n1.equals(n2)); // o equals compara valores
    }
}

// se for 2 numeros diferentes os dois iram da false
// porque o == verifica se apontam para o mesmo espaço de memória
// ja o equals e se os 2 numeros tem o mesmo valor