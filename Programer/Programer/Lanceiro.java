public class Lanceiro extends Personagem {
    public Lanceiro(String nome, Arma arma) {
        super(nome, 80, 18, 12, arma);
    }

    @Override
    public int atacar(Personagem inimigo) {
        int dano = this.ataque + arma.getDanoAdicional();
        inimigo.receberDano(dano);
        return dano;
    }
}
