package sistemaHumano;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cristiano", 'M', 2003);
    
        int idade = p1.calcularIdade(2024);
        System.out.println("Sua idade e: " + idade);

        p1.cumprimentar();
    
    }
}
