import java.util.Objects;
import java.util.Scanner;

class BoletoBancarioClient {
    protected String codigo;
    BoletoBancarioClient(String codigo){
        this.codigo = codigo;
    }
}

public class BoletoBancario implements FormaDePagamento{
    BoletoBancarioClient[] clients = new BoletoBancarioClient[]{
            new BoletoBancarioClient("12345"),
            new BoletoBancarioClient("01234")
    };
    @Override
    public boolean autenticar(){
        int i;
        boolean found = false;
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Qual o codigo do boleto?");
        String userCodigo = stringScanner.nextLine();

        for (i=0; i< clients.length; i++){
            if(Objects.equals(clients[i].codigo, userCodigo)){
                found = true;
            }
        }
        return found;
    }

    @Override
    public void processarPagamento(double valor){

        if (autenticar()) {
            System.out.println("Pagamento com boleto bancario no valor de " + valor + " processado com sucesso");
        }else System.out.println("Pagamento com boleto bancario no valor de " + valor + " não foi autorizado");

    }
}
