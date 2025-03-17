public class carro {
    private double velocidade;
    private String marca;
    private String modelo;

    public void acelerar (double intensidade){
        velocidade += intensidade;
    }

    public void frear (double intensidade){
        velocidade -= intensidade;
    }

    public void imprimirVelocidade(){
        System.out.println("Velocidade " + velocidade);
    }

    public String obterMarca(){
        return marca;
    }
}