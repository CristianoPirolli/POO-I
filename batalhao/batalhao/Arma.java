package batalhao;

public enum Arma {
    FUZIL(10), RIFLE(10), FACA(2), GRANADA(5), PUNHO(1);

    private int peso;

    Arma(int p){
        this.peso = p;
    }

    public int getPeso(){
        return peso;
    }

}
