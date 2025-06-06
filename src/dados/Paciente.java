package dados;

import java.util.ArrayList;

public class Paciente extends Usuario implements Autenticavel{
    private String problema;
    private int idade;
    private ArrayList<PlanoDeTratamento> planoTratamento;

    public Paciente(String nome, String email, String senha, String problema, int idade){
        super(nome, email, senha);
        this.problema = problema;
        this.idade = idade;
        this.planoTratamento = new ArrayList<>();
    }

    public void adicionaPLano(PlanoDeTratamento planoDeTratamento){
        this.planoTratamento.add(planoDeTratamento);
    }

    @Override
    public void login(String email, String senha) {
        super.login(email, senha);
        System.out.println("Logado com email " + this.getEmail());
    }

    public String getProblema() {
        return problema;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<PlanoDeTratamento> getPlanoTratamento() {
        return planoTratamento;
    }

}
