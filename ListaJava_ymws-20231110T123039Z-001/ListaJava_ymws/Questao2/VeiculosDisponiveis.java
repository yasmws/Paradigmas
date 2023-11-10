public abstract class VeiculosDisponiveis {

    int numOcupantesMaximo;
    String[] diasDisponiveis;

    String nome;
    public VeiculosDisponiveis(int num, String[] diasD, String nome){
        this.numOcupantesMaximo = num;
        this.diasDisponiveis = diasD;
        this.nome = nome;
    }

    public int getNumOcupantesMaximo() {
        return this.numOcupantesMaximo;
    }

    public abstract Double precificacao();
}
