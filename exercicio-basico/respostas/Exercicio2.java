package respostas;

public class Exercicio2 {
    public static void main(String[] args) {
        Integer num1 = 128;
        Integer num2 = 128;
        System.out.println(num1 == num2);

    }
}
// Ao imprimir o resultado sera FALSE pois Integer num1 = 128 e num2 criam dois obejtos separados na memória,
// e o operador == em Java, ao ser usado com objetos,verifica se eles são a mesma instância (mesmo endereço de memória),
// e não se têm o mesmo valor.
// O Java mantém um "cache" ou "pool" de objetos Integer para valores no intervalo de -128 a 127.
// Porém, para valores fora desse intervalo, como 128, o Java não usa o pool e cria uma nova instância de objeto
// Integer para cada atribuição.