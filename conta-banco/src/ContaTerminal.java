import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ;

        System.out.println("Por favor, digite o número da conta !");
        int numero_conta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agencia !");
        String numero_agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite seu nome:");
        String nome_cliente = scanner.nextLine(); // Use nextLine() para ler o nome
        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numero_agencia
                        + " , conta " + numero_conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
