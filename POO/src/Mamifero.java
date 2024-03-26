public class Mamifero extends Animal {
    private String alimento;


    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Alimento: " + alimento);
    }
}
