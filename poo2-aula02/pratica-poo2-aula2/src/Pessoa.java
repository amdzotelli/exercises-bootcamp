public class Pessoa {
    String nome;
    int idade;
    String ID;
    double peso;
    double altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(
    String nome,
    int idade,
    String ID,
    double peso,
    double altura
    ) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }
}
