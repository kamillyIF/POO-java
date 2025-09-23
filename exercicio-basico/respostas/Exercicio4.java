package respostas;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = sc.nextDouble();

        int ValorInt = (int) numero;
        System.out.println("double: " + numero + " int: " + ValorInt);

        long ValorLong = (long) numero;
        System.out.println("double: "+ numero + " long: " + ValorLong);

        float valorFloat = (float) numero;
        System.out.println("double: "+ numero + " float: " + valorFloat);

        byte ValorByte = (byte) numero;
        System.out.println("double: " + numero + " byte: "+ ValorByte);
    }
}
