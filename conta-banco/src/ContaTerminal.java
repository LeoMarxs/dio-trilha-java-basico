import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o seu nome completo !");
            String nome = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência !");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da sua conta !");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o seu saldo !");
            BigDecimal saldo = scanner.nextBigDecimal();

            System.out.println("\nOlá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero +" e seu saldo "+saldo+"R$ já está disponível para saque\n");
        }
    }
}
