import java.util.Scanner;

public class Exercicio{
    // public: visibilidade
    // static: pertence á classe (classe != instancia)
    // void: o metodo não retorna nada
    // String[] args: array declado em uma variavel de nome args
    public static void main(String[] args){
        // classe para auxiliar na leitura de dados de entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("digite sua idade:");
        int idade = sc.nextInt();
        System.out.print("digite seu peso:");
        double peso = sc.nextDouble();
       


        System.out.println("Idade: " + idade + " Peso: " + peso);
        // maneira formatada: System.out.printf("Idade: %d Peso: %f", idade, peso);
    }
}
