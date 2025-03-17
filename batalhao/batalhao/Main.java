package batalhao;

public class Main {
    public static void main(String[] args) {
        
        Soldado soldado = new Soldado("soldadinho");
        Soldado soldado2 = new Soldado("chulezinho");

        soldado.movimentar(10);
        soldado.atacar();

        soldado2.movimentar();
        soldado2.atacar();

        Soldado soldado3 = new Soldado("iorgute");

        soldado3.atacar();
        soldado3.movimentar(7);
        soldado.atacar(Arma.RIFLE);
    }
}
