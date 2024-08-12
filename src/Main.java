//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // aviso, não garanto que essa maravilha da tecnologia irá funcionar. se não funcionar deal with it yourself xd
        //System.out.println("Jawa");

        Aluno rogerinho = new Aluno("Rogerinho", "10/10/1999", "123456", "O mano faz PP");

        rogerinho.setTelefone("11", "999821899");

        System.out.println("Nome: " + rogerinho.getNome());
        System.out.println("Data de Nascimento: " + rogerinho.getDataNascimento());
        System.out.println("Curso: " + rogerinho.getCurso());
        System.out.println("Telefone: " + rogerinho.getTelefone());


        Professor marcio = new Professor("Márcio", "10/02/1978", "Mestrado", "18/03/2000");

        System.out.println("Nome: " + marcio.getNome());
        System.out.println("Data de Nascimento: " + marcio.getDataNascimento());
        System.out.println("Grau Acadêmico: " + marcio.getTitulacao());
        System.out.println("Data de Contratação: " + marcio.getDataContratacao());

        Livro psicose = new Livro("Psicose", "Darkside", "17703");
        Livro ladyKillers = new Livro("Lady Killers", "Darkside", "39123");

        rogerinho.retirarLivro(psicose);
        rogerinho.retirarLivro(ladyKillers);
        rogerinho.listarLivrosRetirados();
    }
}
