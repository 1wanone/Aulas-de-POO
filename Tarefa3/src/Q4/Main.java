package Q4;

public class Main {
    public static void main(String[] args) {
        Hospital h1 = new Hospital(" Geral de Maraba");

        Unidade uti = new Unidade("UTI 1","UTI");
        Unidade upa = new Unidade("UPA 5","UPA");

        Medico m1 = new Medico("Joao Carlos","123456/PA");
        Medico m2 = new Medico("Ethel Cain", "654321/PA");

        uti.adicionaMedico(m1);
        uti.adicionaMedico(m2);
        upa.adicionaMedico(m2);

        h1.adcUnidade(upa);
        h1.adcUnidade(uti);

        Paciente p1 = new Paciente("Marina Sena", 24,"123.456.789-10");
        Paciente p2 = new Paciente("Charli XCX",21, "987.654.321-01");

        Consulta c1 = new Consulta("25/05/2025",123456789,m2,p1);
        Consulta c2 = new Consulta("30/05/2025",129878652,m1,p2);

        h1.exibirUnidades();
        c1.exibirConsulta();
        c2.exibirConsulta();


    }
}
