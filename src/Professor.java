public class Professor extends Pessoa {

    private String titulacao;
    private String dataContratacao;

    public Professor(String nome, String dataNascimento, String titulacao, String dataContratacao) {
        super(nome, dataNascimento);
        this.titulacao = titulacao;
        this.dataContratacao = dataContratacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
}
