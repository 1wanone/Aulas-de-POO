package Q4;

class Medico {
    private String nome;
    private String crm;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public void dadosMedico(){
        System.out.println("***Exbindo Informacoes do Medico***");
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
    }

    public String getNome() {
        return nome;
    }

}
