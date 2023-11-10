public class Carro extends VeiculosDisponiveis implements CRV, Seguranca {
    public static Double CONSTANTE = 100.0;
    protected Carro(int numOcupMax, String[] diasDisponiveis, String nome){
        super(numOcupMax, diasDisponiveis, nome);

    }

    @Override
    public Double precificacao() {
        return (super.getNumOcupantesMaximo() * CONSTANTE);
    }

    @Override
    public String getCodRENAVAM() {
        return null;
    }

    @Override
    public String getNomeProprietario() {
        return null;
    }

    @Override
    public String getNumPlaca() {
        return null;
    }

    @Override
    public String getChassi() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public String getAnoDeFabricacao() {
        return null;
    }

    @Override
    public String getAirbags() {
        return null;
    }

    @Override
    public String getTipoCintoDeSeguranca() {
        return null;
    }
}
