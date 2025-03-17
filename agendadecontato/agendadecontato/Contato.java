package agendadecontato;
import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private List<Email> emails;
    private List<Telefone> telefones;

    public Contato (String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public void adicionarEmail(String emails, String rotulo){
        Email e = new Email(emails, rotulo);
        this.emails.add(e);

    }

    public void adicionarTelefone (String telefones, String rotulo){
        Telefone t = new Telefone(telefones, rotulo);
        this.telefones.add(t);

    }

    public String getNome() {
        return nome;
    }

    public void imprimirContato(){
        System.out.println("NOME: " + this.nome);
        System.out.println("EMAILS: " + this.emails);
        System.out.println("TELEFONES: " + this.telefones);
    
    }
}
