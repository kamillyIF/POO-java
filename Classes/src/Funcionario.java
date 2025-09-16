public class Funcionario {
    public static final double VALOR_HORAS_EXTRAS = 45.0;
    public String nome;
    public float salarioBase;
    private int horasExtra;

    // getters e setters
    // getter: metodo que retona o valor de um atributo
    public int getHorasExtra(){
        return horasExtra;
    }
    // setter: metodo que redefine o valor de um atributo
    public void setHorasExtra(int horasExtra) throws Exception {
        if(horasExtra < 15){
            this.horasExtra = horasExtra;
        }else{
            System.out.println("O valor de horas extras não pode ser superior a 15");
        }

    }

    //Sobregarga de métodos
    // Fornecer mais uma implementação para um metodo
    // de um determinado nome
    // As implemetações devem possuir assinaturas diferentes
    // Assinatura: nomeDeMetodo(tipo1, tipo2,...)
    public double calcularSalario() {
        // Assinatura: calcularSalario()
        return salarioBase + horasExtra * VALOR_HORAS_EXTRAS;
    }
}
