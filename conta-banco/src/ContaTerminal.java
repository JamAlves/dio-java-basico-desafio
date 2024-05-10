import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Conta:");
        int numConta = scanner.nextInt();

        System.out.println("Digite o numero da agencia:");
        String numAgencia = scanner.next();

        System.out.println("Digite o Saldo em conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.next();

        
        System.out.println("Numero da Conta é: " + numConta);
        System.out.println("Numero da agencia é: " + numAgencia);
        System.out.println("Nome do Cliente é: " + nomeCliente);
        System.out.println("Saldo em conta è: " + saldo);
       

    


         
        
        // Exibir as mensagem para o nosso usuario

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada 
    }
}
