import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercito {
    private String nome;
    private List<Personagem> personagens = new ArrayList<>();

    public Exercito(String nome) {
        this.nome = nome;
    }

    public void adicionarPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public boolean estaDerrotado() {
        for (Personagem personagem : personagens) {
            if (personagem.estaVivo()) {
                return false;
            }
        }
        return true;
    }

    public Personagem obterVivosRandom() {
        List<Personagem> vivos = new ArrayList<>();

        for (Personagem personagem : personagens) {
            if (personagem.estaVivo()) {
                vivos.add(personagem);
            }
        }

        if (vivos.isEmpty()) {
            return null;
        }

        Random random = new Random();
        return vivos.get(random.nextInt(vivos.size()));
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    @Override
    public String toString() {
        String vivos = "vivos: ";
        boolean temVivos = false;

        for (Personagem personagem : personagens) {
            if (personagem.estaVivo()) {
                if (temVivos) {
                    vivos += ", ";
                }
                vivos += personagem.nome;
                temVivos = true;
            }
        }

        if (!temVivos) {
            vivos += "Nenhum.";
        }
        return nome + " " + vivos;
    }

    public String getNome() {
        return nome;
    }
}
