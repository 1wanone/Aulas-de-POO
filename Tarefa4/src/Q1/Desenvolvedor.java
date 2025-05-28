package Tarefa4;

class Desenvolvedor extends FuncionarioTI {
    private String linguagemPrincipal;
    private String nivel;

    public Desenvolvedor(String nome, int matricula, String linguagemPrincipal, String nivel) {
        super(nome,matricula);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }

    public void desenvolverProjeto(){
        System.out.println(getNome()+" Esta desenvolvendo um projeto...");
    }

    public void atualizarProjeto(){
        System.out.println("Atualizando projeto...");
    }

    public void exibirTecnologiasUsadas(){
        System.out.println("Tecnologia usada: " + this.linguagemPrincipal);
    }

    public void revisarCodigo(){
        System.out.println("Revisando codigo...");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linguagem Principal: " + this.linguagemPrincipal);
        System.out.println("Nivel: " + this.nivel);
    }

    public void atualizarCadastroDev(String nome, int matricula, String linguagemPrincipal, String nivel) {
        System.out.println("Atualizando Dev...");
        super.atualizarCadastro(nome, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }
}
