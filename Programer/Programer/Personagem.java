public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected Arma arma;

    public Personagem(String nome, int vida, int ataque, int defesa, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.arma = arma;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        int danoFinal = Math.max(dano - defesa, 0);
        vida -= danoFinal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + danoFinal + " de dano. Vida Restante: " + vida);
    }

    public abstract int atacar(Personagem inimigo);

    public Arma getArma() {
        return arma;
    }

    @Override
    public String toString() {
        return nome + "(Vida: " + vida + ", Ataque: " + ataque + ", Defesa: " + defesa + ")";
    }
}
