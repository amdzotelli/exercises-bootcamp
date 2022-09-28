public class Participante {
    String RG, nome, sobrenome, numeroCelular, numeroEmergencia, grupoSanguineo;
    int idade;
    int numeroParticipante;

    public Participante(String RG, String nome, String sobrenome, String numeroCelular, String numeroEmergencia, String grupoSanguineo, int idade, int numeroParticipante) {
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.idade = idade;
        this.numeroParticipante = numeroParticipante;
    }

    public int getNumeroParticipante() {
        return ++numeroParticipante;
    }



}
