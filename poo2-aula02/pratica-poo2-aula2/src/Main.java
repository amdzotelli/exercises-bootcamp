public class Main {
    public static void main(String[] args) {
        Pessoa alberto = new Pessoa();

        alberto.nome = "Alberto";
        alberto.ID = "a1b2c3";
        alberto.altura = 1.72;
        alberto.peso = 95;
        alberto.idade = 32;

        Pessoa juliana = new Pessoa("Juliana", 23, "aaa2e3");

        Pessoa magali = new Pessoa("Magali", 19, "1e2b3", 65, 1.65);

        System.out.println(alberto.nome + " " + juliana.idade + " " + magali.peso);
    }
}