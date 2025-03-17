package contaCorrente;

public class Main {
    public static void main(String[] args) {
        
        String nome = "Cristiano";
        String cpf = "12345678900";
        String email = "crisrpirolli@gmail.com";
        String senha = "pirolli2024";

        Conta cc1 = new Conta(nome, cpf, email, senha);

        nome = "Andressa";
        cpf = "12309845687";
        email = "ziniandressa@gmail.com";
        senha = "drezy123";

        Conta cc2 = new Conta(nome, cpf, email, senha);

        cc1.depositar(100);
        if (cc1.sacar(150))
            System.out.println("Retire seu dinheiro");
        else 
            System.out.println("Saldo insuficiente");
        System.out.println(cc1);

        cc2.depositar(2000);
        System.out.println(cc2);

        if (cc2.transferir(6, cc1))
            System.out.println("Pronto!!! " + cc1.getNome() + " Agradece");
        else 
            System.out.println("Saldo insuficiente");
    }    
}
