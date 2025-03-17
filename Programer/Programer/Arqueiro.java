public class Arqueiro extends Personagem {
    public Arqueiro(String nome, Arma arma) {
        super(nome, 85, 20, 7, arma);
    }

    @Override
    public int atacar(Personagem inimigo) {
        int dano = this.ataque + arma.getDanoAdicional();
        inimigo.receberDano(dano);
        return dano;
    }
}
