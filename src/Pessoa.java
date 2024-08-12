import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Telefone telefone;
    private ArrayList<Livro> livros;

    public Pessoa(String nome, String data){
        this.nome = nome;
        this.dataNascimento = data;
    }

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
        telefone = new Telefone(ddd, numero);
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

    public void devolverLivro(Livro livroDevolvido){
        if(livroDevolvido != null && !livros.isEmpty()){

            Livro livroParaRemover = null;

            for(Livro livro : livros){
                if(livro.getIsbn().equals(livroDevolvido.getIsbn())){
                    livroParaRemover = livro;
                    break;
                }
            }
            if(livroParaRemover != null){
                livros.remove(livroParaRemover);
                livroDevolvido.devolverLivro();
            }

        }
    }

    public void retirarLivro(Livro livro){
        if(livro != null){
            addLivro(livro);
            livro.setPessoa(this);
        }
    }

}
