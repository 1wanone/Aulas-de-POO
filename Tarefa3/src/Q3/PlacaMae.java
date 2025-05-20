package Q3;

class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numSlot;
    private String tipoMem;

    public PlacaMae(String fabricante, String chipset, int numSlot, String tipoMem) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numSlot = numSlot;
        this.tipoMem = tipoMem;
    }

    public void exibirDados() {
        System.out.println("Placa-Mae: ");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Chipset: " + chipset);
        System.out.println("Numero de Slot: " + numSlot);
        System.out.println("Tipo de Memoria: " + tipoMem);
    }

    public void atualizarDados(String fabricante, String chipset, int numSlot, String tipoMem) {
        System.out.println("***PLaca-Mae atualizada***");
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numSlot = numSlot;
        this.tipoMem = tipoMem;
    }
}
