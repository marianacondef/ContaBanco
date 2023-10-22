import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo:");
        int saldo = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();


    }
}
