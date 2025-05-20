package Q4;

class Consulta {
    private String data;
    private int idConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, int idConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void exibirConsulta() {
        System.out.println("***Exibindo dados da consulta***");
        System.out.println("Data da consulta: " + data
        + "\nId da consulta: " + idConsulta
        + "\nMedico: " + medico.getNome()
        + "\nPaciente atendido: " + paciente.getNome());
    }
}
