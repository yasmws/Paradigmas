import java.util.Objects;
import java.util.Scanner;

class PayPalClient{
    protected String login;
    protected String senha;
    PayPalClient(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
}

public class PayPal implements FormaDePagamento{
    PayPalClient[] clients = new PayPalClient[]{
            new PayPalClient("ymws","senha123"),
            new PayPalClient("yas","I_like_java")
    };
    @Override
    public boolean autenticar(){
        int i;
        boolean found = false;
        System.out.println("Qual o seu login?");
        Scanner stringScanner = new Scanner(System.in);
        String userLogin = stringScanner.nextLine();
        System.out.println("Qual a sua senha?");
        String userSenha = stringScanner.nextLine();

        for (i=0; i< clients.length; i++){
            if(Objects.equals(clients[i].login, userLogin) && Objects.equals(clients[i].senha,userSenha)){
                found = true;
            }
        }
        return found;
    }

    @Override
    public void processarPagamento(double valor){

        if (autenticar()) {
            System.out.println("Pagamento com PayPal no valor de " + valor + " processado com sucesso");
        }else System.out.println("Pagamento com PayPal no valor de " + valor + " não foi autorizado");

    }
}
