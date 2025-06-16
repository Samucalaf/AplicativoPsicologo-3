package dados;

import java.util.ArrayList;

public class PlanoDeTratamento {
    private String objetivo;
    private int numeroSessoes;
    private int sessoesRealizadas;
    private ArrayList<Sessao> sessoes;
    private Psicologo psicologo;
    //atributo Pscicologo para associar o plano de tratamento ao psicologo

    public PlanoDeTratamento(String objetivo, int numeroSessoes, Psicologo psicologo){
        this.objetivo = objetivo;
        this.numeroSessoes = numeroSessoes;
        this.sessoesRealizadas = 0;
        this.sessoes = new ArrayList<>();
        this.psicologo = psicologo;
    }

    public void adicionarSessaoRealizada(Sessao sessao){
        this.sessoes.add(sessao);
        this.sessoesRealizadas++;
    }

    public double verificarProgresso(){
        if(numeroSessoes == 0) return 0.0;
        return (double) sessoesRealizadas / numeroSessoes * 100;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getNumeroSessoes() {
        return numeroSessoes;
    }

    public int getSessoesRealizadas() {
        return sessoesRealizadas;
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }
}
