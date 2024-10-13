
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //Configuração do Scanner para solicitar ao usuario os dados 
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        // Useu o try caso algum erro seja apresentado ao solicitar dados ele nao finalize bruscamente o programa
        try {
            // Solicitando e recebendo os dados do usuário
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o nome do Cliente:");
            scanner.nextLine();  // quebra de linha apos nextLine ou next
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo (use ponto como separador decimal):");
            double saldo = scanner.nextDouble();

            // apresentação do resultado apos solicitação dos dados
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Formato de entrada inválido. Por favor, verifique os dados inseridos.");
        } finally {
            scanner.close();
        }
    }
}
