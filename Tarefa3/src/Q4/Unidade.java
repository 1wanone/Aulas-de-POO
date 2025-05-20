package Q4;

import java.util.ArrayList;
import java.util.List;

class Unidade {
    private String nome;
    private String tipo;
    private List<Medico> medicos = new ArrayList<>();

    public Unidade(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void adicionaMedico(Medico m) {
        medicos.add(m);
    }

    public void infoUnidade() {
        System.out.println("***Exbindo dados da unidade***");
        System.out.println("Unidade: " + nome + " / " + tipo);
        for (Medico m : medicos){
            System.out.println("Medicos: " + m.getNome());
        }
    }
}
