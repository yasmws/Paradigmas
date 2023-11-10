class PagNaoAutorizado extends Exception{
    PagNaoAutorizado(double valor) {
        super("Pagamento com PayPal no valor de " + valor + "não foi autorizado");
    }
}
