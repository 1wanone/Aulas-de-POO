package Q2;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }

    public void exibirDetalhes() {
        System.out.println("Curso: " + nome
        + "\nCargaHoraria: " + cargaHoraria
        + "\nNivel: " + nivel
        + "\nDescricao: " + descricao
        + "\nInstrutores: ");
        for (Instrutor i : instrutores) {
            System.out.println("Nome: " + i.getNome()
            + "\nFormacao: " + i.getFormacao()
            + "\nEmail: " + i.getEmail()
            + "\nAnos de Experiencia: " + i.getAnoExp());

        }
    }
}
