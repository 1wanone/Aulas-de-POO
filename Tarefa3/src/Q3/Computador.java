package Q3;

class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memRam;
    private PlacaMae placa;

    public Computador(String marca, String modelo, String processador, int memRam,
                      String fabricante, String chipset, int numSlot, String tipoMem) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memRam = memRam;
        this.placa = new PlacaMae(fabricante, chipset, numSlot, tipoMem);
    }

    public void exibirEspecific(){
        System.out.println("Especificacoes do computador: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memoria Ram: " + memRam);
        placa.exibirDados();
    }

    public void atualizarPlacaMae(String fabricante, String chipset, int numSlot, String tipoMem){
        placa.atualizarDados(fabricante, chipset, numSlot, tipoMem);
    }

}
