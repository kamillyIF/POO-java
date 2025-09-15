import java.util.Scanner;
public class Par {
    public static void main(String[] args) {
       int numero = 1;
       int soma = 0;
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
       
        while(numero <= 100){
            if(numero % 2 == 0){
                soma += numero;
            }
            numero ++;
        }
        System.out.println(soma);
    }
   
}
