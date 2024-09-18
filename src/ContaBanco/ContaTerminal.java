package ContaBanco;

import java.util.Locale;
import java.util.Scanner;
//To-do Conhecer e importar a classe Scanner
public class ContaTerminal {

    public static void main(String[] args) {
        //Exibir as mensagens para o nosso usuario
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Número Conta inteira: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência : ");
        String agencia = scanner.next();

        System.out.println("Nome do Cliente: ");
        String cliente = scanner.next();

        System.out.println("Saldo Decimal: ");
        double saldo = scanner.nextDouble();
        //Exibir a mensagem conta criada
        System.out.println("Olá"+cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+"e seu saldo "+saldo+" está disponível para saque\"");

    }
}
