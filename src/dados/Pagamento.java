package dados;

public class Pagamento {
    private double valor;
    private String metodoPagamento;

    public Pagamento(double valor, String metodoPagamento){
        this.metodoPagamento = metodoPagamento;
        this.valor = valor;
    }

    public void pagar() {
        System.out.println("Pagamento de R$" + this.valor + " feito via " + this.metodoPagamento + " autorizado!");
    }

    public void setPagamento(double valor, String metodo) {
        this.valor = valor;
        this.metodoPagamento = metodo;
    }
}
