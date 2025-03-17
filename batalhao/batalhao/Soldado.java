package batalhao;

public class Soldado {
    
    public static int soldados = 0;
    private String nome;
    private int posicao;
    private final int posicaoPadrao = 3;
    private final Arma armaPadrao = Arma.FUZIL;
    private String arma;
    private int dano;

    public Soldado(String nome){
        this.nome = nome;
        this.posicao = posicao;
        this.arma = arma;
        this.dano = dano;
        this.soldados++;
    }


    public void movimentar(int distancia){
        System.out.printf("O %s se movimentou " + distancia + " metros.\n", nome);
    }

    public void movimentar(){
        System.out.printf("O %s se movimentou " + posicaoPadrao + " metros.\n", nome);
    }

    public void atacar(Arma arma){
        if(soldados >= 3){
        System.out.printf("O %s atacou com " + arma + " o inimigo e sofreu dano " + arma.getPeso(), nome);
        }
        else{
            System.out.println("Melhore seu pelotao para atacar\n");
        }
    }

    public void atacar(){
        if(soldados >= 3){
            System.out.printf("O %s atacou com " + armaPadrao + " o inimigo\n", nome);
        }
        else{
            System.out.println("Melhore seu pelotao para atacar\n");
        }
    }

}
