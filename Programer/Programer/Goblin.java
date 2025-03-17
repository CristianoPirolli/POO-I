public class Goblin extends Personagem {
    public Goblin(String nome, Arma arma) {
        super(nome, 60, 10, 5, arma);
    }

    @Override
    public int atacar(Personagem inimigo) {
        int dano = this.ataque + arma.getDanoAdicional();
        inimigo.receberDano(dano);
        return dano;
    }
}
