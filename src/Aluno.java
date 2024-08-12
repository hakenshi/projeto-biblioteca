public class Aluno extends Pessoa{
    private String ra;
    private String curso;


    public Aluno(String nome, String data, String ra, String curso){
        super(nome, data);
        this.ra = ra;
        this.curso = curso;

    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
