public interface FormaDePagamento {

    boolean autenticar();
    void processarPagamento(double valor);
}
