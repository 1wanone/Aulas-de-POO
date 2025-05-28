package Tarefa4;

class FuncionarioTI {
    private String nome;
    private int matricula;

    public FuncionarioTI(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Dados do funcionario: ");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    public void atualizarCadastro(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
}
