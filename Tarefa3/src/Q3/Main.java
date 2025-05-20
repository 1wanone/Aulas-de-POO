package Q3;

public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador("Lenovo", "LOQ", "Intel i7-12650HX", 16,
                "intel", "H410", 10,"DDR4");

        pc1.exibirEspecific();

        pc1.atualizarPlacaMae("Asus","X155",5,"DDR4");

        pc1.exibirEspecific();
    }
}
