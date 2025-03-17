package soldado;

public class Soldado {

    // Variável de classe para contar o número total de soldados
    private static int totalSoldados = 0;
    
    // Atributos de instância para o soldado
    private final String nome;
    private final String armaPadrao = "Espada";
    private final int deslocamentoPadrao = 5;

    // Construtor do soldado
    public Soldado(String nome) {
        this.nome = nome;
        totalSoldados++; // Aumenta o número total de soldados
    }

    // Método para movimentar o soldado
    public void movimentar(int distancia) {
        System.out.println(this.nome + " se deslocou " + distancia + " metros.");
    }

    // Sobrecarga do método movimentar para usar a distância padrão
    public void movimentar() {
        System.out.println(this.nome + " se deslocou " + this.deslocamentoPadrao + " metros (distância padrão).");
    }

    // Método para atacar com arma definida
    public void atacar(String arma) {
        if (totalSoldados < 3) {
            System.out.println("Aumente a tropa para poder atacar.");
        } else {
            System.out.println(this.nome + " atacou com " + arma + ".");
        }
    }

    // Sobrecarga do método atacar para usar a arma padrão
    public void atacar() {
        if (totalSoldados < 3) {
            System.out.println("Aumente a tropa para poder atacar.");
        } else {
            System.out.println(this.nome + " atacou com " + this.armaPadrao + " (arma padrão).");
        }
    }

    // Método estático para retornar o total de soldados
    public static int getTotalSoldados() {
        return totalSoldados;
    }   
}

