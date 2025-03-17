package soldado;

public class Mainn {

    public static void main(String[] args) {
        // Criando alguns soldados
        Soldado s1 = new Soldado("Soldado 1");
        Soldado s2 = new Soldado("Soldado 2");

        // Tentando atacar com menos de 3 soldados
        s1.atacar();
        
        // Criando mais um soldado
        Soldado s3 = new Soldado("Soldado 3");

        // Movimentando os soldados
        s1.movimentar(10); // Deslocamento definido pelo usuário
        s2.movimentar();   // Deslocamento padrão

        // Atacando com arma definida e arma padrão
        s3.atacar("Arco e Flecha");
        s1.atacar(); // Usando arma padrão

        // Exibindo o total de soldados
        System.out.println("Total de soldados: " + Soldado.getTotalSoldados());
    }
}

