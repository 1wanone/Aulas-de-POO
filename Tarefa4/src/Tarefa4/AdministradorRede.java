package Tarefa4;

class AdministradorRede extends FuncionarioTI {
    private String certificacao;
    private String soResponsavel;

    public AdministradorRede(String nome, int matricula, String certificacao, String soResponsavel) {
        super(nome, matricula);
        this.certificacao = certificacao;
        this.soResponsavel = soResponsavel;
    }

    public void monitorarRede(){
        System.out.println(getNome()+" Esta Monitorando a Rede...");
    }

    public void realizarBackup(){
        System.out.println("Realizando Backup...");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Certificacao: " + this.certificacao);
        System.out.println("So responsavel: " + this.soResponsavel);
    }
    public void atualizarCadastroAdm(String nome, int matricula, String certificacao, String soResponsavel) {
        System.out.println("Atualizando Adm...");
        super.atualizarCadastro(nome, matricula);
        this.certificacao = certificacao;
        this.soResponsavel = soResponsavel;

    }

}
