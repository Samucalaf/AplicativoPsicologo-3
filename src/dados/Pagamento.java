package dados;

public class Pagamento {
    private double valor;
    private String metodoPagamento;

    public Pagamento(double valor, String metodoPagamento){
        this.metodoPagamento = metodoPagamento;
        this.valor = valor;
    }

    public void pagar() {
        System.out.println("Pagamento de R$" + this.valor + " realizado via " + this.metodoPagamento + " autorizado!");
    }
}
