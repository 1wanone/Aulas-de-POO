package Q2;

public class Main {
    public static void main(String[] args) {

        Instrutor i1 = new Instrutor("Manoel Lima", "Linc. Quimica", "manoel@gmail.com",7 );
        Instrutor i2 = new Instrutor("Agatha Almeida","Linc. Biologia", "agatha@gmail.com",10 );

        Curso c1 = new Curso("Bioquimica ", 68, "Intermediario", "Ciencia que estuda substancias quimicas" );
        Curso c2 = new Curso("Quimica geral", 68, "Basico"," Introducao aos conceitos basicos de quimica");

        c1.adicionarInstrutor(i1);
        c1.adicionarInstrutor(i2);
        c2.adicionarInstrutor(i1);

        c1.exibirDetalhes();
        c2.exibirDetalhes();

    }
}
