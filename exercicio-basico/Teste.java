class Teste {
    static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 1000; i++) {
            a += 1;
            Teste.soma(a, i);
        }
    }
}
