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

    public void calcularIMC(double peso, double altura) {
        double imc = peso/Math.pow(altura, 2);
        int imcRounded = (int) imc;
        System.out.println(imc);
        System.out.println(imcRounded);
        checkIMC(imcRounded);
    }

    public void checkIMC(int imc) {
        if (imc < 20) {
            System.out.println("Abaixo do peso");
        } else {
            if (imc >= 20  ||  imc <= 25) {
                System.out.println("Peso Saudável");
            } else {
                System.out.println("Sobrepeso");
            }
        }
    }

    public boolean ehMaiorIdade(int idade) {
        if (idade < 18) {
            System.out.println("Pessoa menor de idade");
            return false;
        } else {
            System.out.println("Pessoa maior de idade");
            return true;
        }
    }

    @Override
    public String toString() {
        System.out.println("Dados da Pessoa: \n" + nome
        + "\n" + idade
        + "\n" + peso
        + "\n" + altura
        + "\n" + ID
        );
        return nome + idade;
    }


}
