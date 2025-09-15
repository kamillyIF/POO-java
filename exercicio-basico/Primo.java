import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        boolean primo = true;

        if (numero <= 1){
            primo = false;
        }else{
            for(int i = 2; i < numero; i++){
                if (numero % i == 0){
                    primo = false;
                }
            }
        }
        if (primo){
            System.out.println(numero + " é primo");
        }else{
            System.out.println(numero + " não é primo");
         }

    }
}
