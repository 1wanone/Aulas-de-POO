package Q2;

class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int anoExp;

    public Instrutor(String nome, String formacao, String email, int anoExp) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.anoExp = anoExp;
    }

    public void exibirInfo(){
        System.out.println("***Exibindo dados do Instrutor***");
        System.out.println("Nome: " + nome);
        System.out.println("Formacao: " + formacao);
        System.out.println("Email: " + email);
        System.out.println("Ano Exp: " + anoExp);
    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getEmail() {
        return email;
    }

    public int getAnoExp() {
        return anoExp;
    }
}
