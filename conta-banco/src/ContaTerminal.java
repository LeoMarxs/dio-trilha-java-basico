import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome completo !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo !");
        int saldo = scanner.nextInt();

        System.out.println("\"Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ", conta"+ numero +" e seu saldo [Saldo] já está disponível para saque\"");
    }
}
