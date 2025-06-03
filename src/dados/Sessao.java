package dados;

import java.time.LocalDateTime;


public class Sessao {
    private LocalDateTime dataHora;
    private String observacoes;
    private Relatorio relatorio;
    private Pagamento pagamento;

    public Sessao(LocalDateTime dataHora, String observacoes){
        this.dataHora = dataHora;
        this.observacoes = observacoes;
        this.relatorio = new Relatorio();
        this.pagamento = new Pagamento(0.0, "Não definido");
    }

    public void marcar() {
        System.out.println("Sessão marcada para o dia " + getDataHora() +
                ". OBSERVAÇÕES: " + getObservacoes());
    }

    public void cancelar() {
        System.out.println("Sessão cancelada");
    }

    public void finalizar() {
        System.out.println("Sessão finalizada");
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
