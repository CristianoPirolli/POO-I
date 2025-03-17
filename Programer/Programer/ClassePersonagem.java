public enum ClassePersonagem {
    ARQUEIRO("Arqueiro", 70, 15, 8),
    GUERREIRO("Guerreiro", 100, 20, 10),
    MAGO("Mago", 80, 25, 5),
    DRUIDA("Druida", 90, 15, 8),
    LANCEIRO("Lanceiro", 80, 18, 12),
    GOBLIN("Goblin", 60, 10, 5);

    private final String nome;
    private final int vida;
    private final int ataque;
    private final int defesa;

    ClassePersonagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
}
