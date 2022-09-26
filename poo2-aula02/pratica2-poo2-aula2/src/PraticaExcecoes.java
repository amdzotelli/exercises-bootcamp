public class PraticaExcecoes {

    public static void main(String[] args) {

        int a = 0;
        int b = 300;

        try {
            double divisao = b / a;
        } catch (IllegalArgumentException exception) {
            System.out.println("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa Finalizado");
        }
    }
}