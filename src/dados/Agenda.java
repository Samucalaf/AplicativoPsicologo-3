package dados;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Sessao> sessoes;

    public Agenda(){
        this.sessoes = new ArrayList<>();
    }

    public void adicionar(Sessao sessao){
        this.sessoes.add(sessao);
    }

    public void remover(Sessao sessao){
        this.sessoes.remove(sessao);
    }

    public boolean verificaDisponibilidade(LocalDateTime dataHora){
        for(Sessao sessao : sessoes){
            if(sessao.getDataHora().equals(dataHora)){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }
}
