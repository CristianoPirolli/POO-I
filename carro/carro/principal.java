public class principal {
    public static void main (String[] args){

        carro fusca = new carro();
        carro chevette = new carro();
        carro ferrari = new carro();

        fusca.acelerar(100);
        fusca.frear(50);

        fusca.imprimirVelocidade();
    }
}
