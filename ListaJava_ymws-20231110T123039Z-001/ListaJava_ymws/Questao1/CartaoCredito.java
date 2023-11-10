import java.util.Objects;
import java.util.Scanner;

class CartaoCreditoClient {
    protected String codigoSeguraca;
    protected String senha;
    CartaoCreditoClient(String codigoSeguraca, String senha){
        this.codigoSeguraca = codigoSeguraca;
        this.senha = senha;
    }
}

public class CartaoCredito implements FormaDePagamento{
    CartaoCreditoClient[] clients = new CartaoCreditoClient[]{
            new CartaoCreditoClient("ymws","senha123"),
            new CartaoCreditoClient("yas","I_like_java")
    };

    @Override
    public boolean autenticar(){
        int i;
        boolean found = false;
        System.out.println("Qual a sua senha?");
        Scanner stringScanner = new Scanner(System.in);
        String userSenha = stringScanner.nextLine();
        System.out.println("Qual o seu codigo de seguranca do cartao?");
        String userCodigo = stringScanner.nextLine();

        for (i=0; i< clients.length; i++){
            if(Objects.equals(clients[i].codigoSeguraca, userCodigo) && Objects.equals(clients[i].senha,userSenha)){
                found = true;
            }
        }
        return found;
    }

    @Override
    public void processarPagamento(double valor){

        if (autenticar()) {
            System.out.println("Pagamento com cartao de credito no valor de " + valor + " processado com sucesso");
        }else System.out.println("Pagamento com cartao de credito no valor de " + valor + " não foi autorizado");

    }
}
