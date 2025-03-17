package agendadecontato;

import java.util.ArrayList;
import java.util.List;
import agendadecontato.Email;


public class Agenda {
    
    private List<Contato> contatos;

    public Agenda () {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato (Contato contato) {
        this.contatos.add(contato);
    }
    
    public void imprimirContatos () {
        for (Contato contato : contatos) {
            contato.imprimirContato();
            System.out.println();
        }
    }

    public void imprimirNomeContatos () {
        for (Contato contato : contatos) {
            System.out.println(contato.getNome());
        }
    }

    public void imprimirDadoContato () {


    }

    /*public Contato removerContato (int i) {
        return this.contatos.remove(i);
    }*/

    public boolean removerContato(String nome){
        Contato c = buscarContato(nome);
        if(c != null){
            contatos.remove(c);
            return true;
        }else
        return false;
    }

    public Contato buscarContato(String nome){
        for (Contato contato : contatos) {
            if (nome.equalsIgnoreCase(contato.getNome()))
            return contato;
        }
        return null;
    }


    public void addEmail () {
        

    }

    public void addTelefone () {


    }

    

    public void equals () {

    }

}
