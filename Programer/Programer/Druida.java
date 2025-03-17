public class Druida extends Personagem {
    public Druida(String nome, Arma arma) {
        super(nome, 90, 15, 8, arma);
    }

    @Override
    public int atacar(Personagem inimigo) {
        int dano = this.ataque + arma.getDanoAdicional();
        inimigo.receberDano(dano);
        return dano;
    }
}
