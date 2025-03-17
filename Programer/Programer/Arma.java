public enum Arma {
    ESPADA(10),
    ARCO(8),
    CLAVA(6),
    MACHADO(12),
    VARINHA(5);

    private final int danoAdicional;

    Arma(int danoAdicional) {
        this.danoAdicional = danoAdicional;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }
}
