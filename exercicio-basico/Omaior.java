import java.util.Scanner;
public class Omaior {
    public static void main(String[] args) {
        System.out.print("digite sua idade: ");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();


        if (idade < 18){
        System.out.println("é menor de idade");
        }
        else{
        System.out.println("é maior de idade");
        }
     
    }
}
