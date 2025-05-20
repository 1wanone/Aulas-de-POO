package Q4;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String nome;
    private List<Unidade> unidades = new ArrayList<>();

    public Hospital(String nome) {
        this.nome = nome;
    }

    public void adcUnidade(Unidade u){
        unidades.add(u);
    }

    public void exibirUnidades(){
        System.out.println("Unidades do Hospital " + nome);
        for(Unidade u : unidades){
            u.infoUnidade();
        }
    }
}
