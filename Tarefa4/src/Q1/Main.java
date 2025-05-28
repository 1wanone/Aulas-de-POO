package Tarefa4;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Marcelo",1234,"Java","Senior");
        AdministradorRede a1 = new AdministradorRede("Luara",1543,"CISPP","Linux");

        d1.exibirDados();
        d1.desenvolverProjeto();
        d1.exibirTecnologiasUsadas();
        d1.revisarCodigo();
        d1.atualizarProjeto();

        a1.exibirDados();
        a1.monitorarRede();
        a1.realizarBackup();

        a1.atualizarCadastroAdm("Laila", 12456,"CISPP","Windows");
        a1.exibirDados();
        a1.monitorarRede();
        a1.realizarBackup();
    }
}
