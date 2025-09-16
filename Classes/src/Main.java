public class Main {
    public static void main(String[] args) {
        String nome;
        double salarioBase;
        int horasExtra;
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Ana";
        funcionario1.salarioBase = 2000;
        funcionario1.setHorasExtra(14);

        System.out.println("Salario: " + funcionario1.calcularSalario());
    }
}
