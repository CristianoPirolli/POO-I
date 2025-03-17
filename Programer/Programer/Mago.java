public class Mago extends Personagem {
    public Mago(String nome, Arma arma) {
        super(nome, 80, 25, 5, arma);
    }

    @Override
    public int atacar(Personagem inimigo) {
        int dano = this.ataque + arma.getDanoAdicional();
        inimigo.receberDano(dano);
        return dano;
    }
}
