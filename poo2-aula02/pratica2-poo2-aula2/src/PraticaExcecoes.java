public class PraticaExcecoes {

    public static void main(String[] args) {

        int a = 0;
        int b = 300;

        try {
            System.out.println("Resposta = " + dividir(b, a));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
        System.out.println("Programa Finalizado");
    }
    }

    public static int dividir(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return x / y;
    }

}