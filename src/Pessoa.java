import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Telefone telefone;
    private ArrayList<Livro> livros;

    public Pessoa(String nome, String dataNascimento, Telefone telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.livros = new ArrayList<>();
    }

    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return "(" + telefone.getDdd() + ")" + telefone.getNumero();
    }

    public void setTelefone(String ddd, String numero) {
        telefone.setDdd(ddd);
        telefone.setNumero(numero);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void addLivro(Livro livro) {
        if(livro != null){
            livros.add(livro);
        }
    }

    public void listarLivrosRetirados(){
        if(livros != null && !livros.isEmpty()){
            System.out.printf("Livros retirados por: %s\n", nome);
            int i = 0;
            for(Livro livro : livros){
                System.out.printf("LIVRO - %d : ", i);
                livro.mostrar();
                i++;
            }
        }
        else {
            System.out.println("Nenhum livro encontrado");
        }
    }

    public void retirarLitro(Livro livro){
        if(livro != null){
            System.out.println("Livro retirado: ");
        }
    }

}
