public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }


    public void exibirDados() {
        super.exibirDados();
        System.out.println("Caracteristica: " + caracteristica);
    }
}
