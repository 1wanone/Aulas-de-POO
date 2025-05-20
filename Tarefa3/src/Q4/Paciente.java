package Q4;

class Paciente {
    private String nome;
    private int idade;
    private String cpf;

    public Paciente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void infoPaciente(){
        System.out.println("***Exibindo Informacoes do Paciente***");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
