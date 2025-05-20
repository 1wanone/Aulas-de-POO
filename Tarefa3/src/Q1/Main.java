package Q1;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fiat Strada", 2020, "Branco");
        Carro c2 = new Carro("Fiat Uno", 2024, "Preto");

        Pessoa p1 = new Pessoa("Manoel", 1994);
        Pessoa p2 = new Pessoa("Agatha", 2000);

        p1.usarCarro(c1);
        p1.usarCarro(c2);
        p2.usarCarro(c2);

        System.out.println("Carros que " + p1.getNome() + " ja usou");
        for (Carro c : p1.getCarrosUsados()){
            System.out.println(" " + c.getModelo() + " " + c.getCor() + " " + c.getAno());
        }

    }
}
