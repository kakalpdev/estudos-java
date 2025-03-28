import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua conta: "); // Exibe a mensagem para o usuário solicitando a entrada
        String numeroConta = scanner.nextLine();  // Lê a entrada do usuário e armazena na variável numeroConta

        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        String saldo = scanner.nextLine();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
            
        //TODO: Conhecer e importar a classe scanner

            //Exibir as mensagens para o nosso usuário

            //Obter pela scanner os valores digitados no terminal

            //Exibir a mensagem conta criada
    }
}
