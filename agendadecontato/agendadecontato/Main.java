package agendadecontato;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        String email;
        String rotEmail;
        String telefone;
        String rotTelefone;

        Contato c1 = new Contato ("Cristiano");

        email = "crisrpirolli@gmail.com";
        rotEmail = "pessoal";
        telefone = "49999033034"; 
        rotTelefone = "pessoal";

        c1.adicionarEmail(email, rotEmail);
        c1.adicionarTelefone(telefone, rotTelefone);

        minhaAgenda.adicionarContato(c1);

        Contato c2 = new Contato("Joao");
        email = "joao@gmail.com";
        rotEmail = "pessoal";
        telefone = "4999999999";
        rotTelefone = "pessoal";

        c2.adicionarEmail(email, rotEmail);
        c2.adicionarTelefone(telefone, rotTelefone);

        minhaAgenda.adicionarContato(c2);
        
        Contato c3 = new Contato("Moises");
        email = "moises@ifc.com.br";
        rotEmail = "Academico";
        telefone = "49999764321";
        rotTelefone = "Pessoal";

        c3.adicionarEmail(email, rotEmail);
        c3.adicionarTelefone(telefone, rotTelefone);

        minhaAgenda.adicionarContato(c3);

        Contato c4 = new Contato("Andressa");
        minhaAgenda.adicionarContato(c4);

        minhaAgenda.imprimirContatos();
        minhaAgenda.imprimirNomeContatos();
        
    }
}
