public class Guerreiro extends Personagem {
    public Guerreiro(String nome, Arma arma) {
        super(nome, 100, 20, 10, arma);
    }

    @Override
    public int atacar(Personagem inimigo) {
        int dano = this.ataque + arma.getDanoAdicional();
        inimigo.receberDano(dano);
        return dano;
    }
}
