public class Main {
    public static void main(String[] args) {
        Exercito iluminados = new Exercito("Iluminados");
        Exercito anjosDaMadrugada = new Exercito("Anjos da Madrugada");

        iluminados.adicionarPersonagem(new Mago("Mago", Arma.VARINHA));
        iluminados.adicionarPersonagem(new Guerreiro("Guerreiro", Arma.ESPADA));
        iluminados.adicionarPersonagem(new Druida("Druida", Arma.CLAVA));

        anjosDaMadrugada.adicionarPersonagem(new Lanceiro("Lanceiro", Arma.MACHADO));
        anjosDaMadrugada.adicionarPersonagem(new Arqueiro("Arqueiro", Arma.ARCO));
        anjosDaMadrugada.adicionarPersonagem(new Goblin("Goblin", Arma.ESPADA));

        System.out.println("BATALHA TRAVADA!!!\n");

        batalhar(iluminados, anjosDaMadrugada);
    }

    private static void batalhar(Exercito time1, Exercito time2) {
        while (!time1.estaDerrotado() && !time2.estaDerrotado()) {
            Personagem atacante1 = time1.obterVivosRandom();
            Personagem alvo1 = time2.obterVivosRandom();

            if (atacante1 != null && alvo1 != null) {
                System.out.println(atacante1.nome + " atacou " + alvo1.nome + " com a " + atacante1.getArma() + ":");
                int danoCausado1 = atacante1.atacar(alvo1);
                System.out.println(atacante1.nome + " causou " + danoCausado1 + " de dano em " + alvo1.nome + "\n");
            }

            if (time2.estaDerrotado()) break;

            Personagem atacante2 = time2.obterVivosRandom();
            Personagem alvo2 = time1.obterVivosRandom();

            if (atacante2 != null && alvo2 != null) {
                System.out.println(atacante2.nome + " atacou " + alvo2.nome + " com a " + atacante2.getArma() + ":");
                int danoCausado2 = atacante2.atacar(alvo2);
                System.out.println(atacante2.nome + " causou " + danoCausado2 + " de dano em " + alvo2.nome + "\n");
            }

            if (time1.estaDerrotado()) break;
        }

        if (time2.estaDerrotado()) {
            System.out.println(time1.getNome() + " VENCERAM!!!");
            System.out.println(time1);
        } else {
            System.out.println(time2.getNome() + " VENCERAM!!!");
            System.out.println(time2);
        }
    }
}
