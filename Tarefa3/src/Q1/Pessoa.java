package Q1;
import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private int idade;
    private List<Carro> carrosUsados;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.carrosUsados = new ArrayList<>();
    }

    public void usarCarro(Carro carro) {
        System.out.println(nome + " Esta usando o carro " + carro.getModelo());
        carro.dirigir();
        carrosUsados.add(carro);

    }

    public String getNome() {
        return nome;
    }

    public List<Carro> getCarrosUsados() {
        return carrosUsados;
    }
}
