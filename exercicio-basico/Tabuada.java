import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for(int i = 1; i <= 10; i ++){
            int resultado = numero * i;
            System.out.println(numero + "x" + i + " = " + resultado);
        }
    }
}
