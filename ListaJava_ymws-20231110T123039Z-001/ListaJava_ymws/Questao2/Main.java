public class Main {

    public static void main(String[] args){

        Carro carro = new Carro(5,new String[]{"01/01", "02/01", "03/01"}, "carro feio");
        Carro carro1 = new Carro(7,new String[]{"01/02", "02/02", "03/01"}, "carro bonito");
        Carro carro2 = new Carro(5,new String[]{"01/02", "02/02", "13/01"}, "fusca");

        //Eu gostaria de saber quais os veiculos disponiveis para o dia 03/01 e quais os preços deles
        String dataParaVerificar = "03/01"; //Usuário insere a data e ele verifica
        VeiculosDisponiveis[] veiculos = {carro, carro1, carro2};

        for (VeiculosDisponiveis veiculo : veiculos) {
            for (String data : veiculo.diasDisponiveis) {
                if (data.equals(dataParaVerificar)) {
                    System.out.println("Veículo disponível para " + dataParaVerificar + ": " + veiculo.nome);
                    System.out.println("Preço do veículo: " + veiculo.precificacao());
                }
            }
        }

    }

}