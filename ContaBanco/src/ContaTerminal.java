import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Definindo variaveis
        String nomeCliente;
        String sobrenomeCliente;
        String agencia;
        double saldo;
        int numero;

        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);
        
        // exibir as mensagens para o usuario
        System.out.println("Bem vindo, vamos criar uma conta em nosso banco!"); 
        System.out.println("\nPor favor nos informe seu nome e sobrenome: ");  
        nomeCliente = scanner.next();
        sobrenomeCliente = scanner.next();

        System.out.println("Nos informe o numero da sua agencia: ");
        agencia = scanner.next();

        System.out.println("Nos informe o numero da sua conta: ");
        numero = scanner.nextInt();
        
        System.out.println("Nos informe o saldo inicial da conta: ");
        saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal 

        // Exibir a mensagem da conta criada
        System.out.println("Bem-vindo, " + nomeCliente + " " + sobrenomeCliente + "! Sua conta foi criada com sucesso!");
        System.out.println("Aqui está os dados da sua conta: ");
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: " + saldo);
     
        scanner.close();
    }
}
