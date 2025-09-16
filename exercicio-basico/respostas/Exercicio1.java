package respostas;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer num1 = 100; // declara uma variavel do tipo Integer
        Integer num2 = 100;
        Integer num3 = 200;
        Integer num4 = 200;
        System.out.println(num1 == num2); // o == verifica se duas variais de tipos primitivos apontam para o mesmo valor
        System.out.println(num3 == num4); // o mesmo acontece para esse
        System.out.println(num1.equals(num2)); // compara dois objetos de acordo com seu conteudo
    }
}
