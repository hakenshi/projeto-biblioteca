public class Livro {
    private String nome;
    private String editora;
    private String isbn;

    public Livro(String nome, String editora, String isbn) {
        this.nome = nome;
        this.editora = editora;
        this.isbn = isbn;
    }
    public Livro(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void mostrar(){
        System.out.printf("Nome: %s\nEditora: %s\nISBN: %s\n", nome, editora, isbn);
    }
}
