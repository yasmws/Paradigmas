import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userPagamento;
        do {
            System.out.println("Escolha o seu método de pagamento desejado:");
            System.out.println("1.Boleto Bancário");
            System.out.println("2.Cartao de Credito");
            System.out.println("3.PayPal");
            System.out.println("4.Sair do menu");

            userPagamento = scanner.nextInt();

            switch (userPagamento) {
                case 1 -> {
                    System.out.println("Entrando no método BoletoBancario");
                    System.out.println("Qual o valor do pagamento que deseja realizar?");
                    double valor = scanner.nextDouble();
                    BoletoBancario b = new BoletoBancario();
                    b.processarPagamento(valor);
                }

                case 2 -> {
                    System.out.println("Entrando no método Cartão de Crédito");
                    System.out.println("Qual o valor do pagamento que deseja realizar?");
                    double valor = scanner.nextDouble();
                    CartaoCredito c = new CartaoCredito();
                    c.processarPagamento(valor);
                }

                case 3 -> {
                    System.out.println("Entrando no método PayPal");
                    System.out.println("Qual o valor do pagamento que deseja realizar?");
                    double valor = scanner.nextDouble();
                    PayPal p = new PayPal();
                    p.processarPagamento(valor);
                }

                case 4 -> System.out.println("Saindo do menu de método de pagamento");

                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (userPagamento != 4);

        scanner.close();
    }
}
