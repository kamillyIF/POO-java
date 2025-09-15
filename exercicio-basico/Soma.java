import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.print("digite o segundo valor: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multipicacao = n1 * n2;
        int divisao = n1 / n2;


        System.out.println("Soma: " + soma + " Subtração: " + subtracao + " Multiplicação: " + multipicacao + " Divisão: " + divisao);


    }
}
