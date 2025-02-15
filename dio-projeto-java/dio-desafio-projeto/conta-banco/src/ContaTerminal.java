import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //nome agencia, numero, saldo

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao nosso banco.");
        System.out.print("Nos diga seu nome:\n-> ");
        String nomeCliente = scan.nextLine();
        System.out.print("Digite a sua agência:\n-> ");
        String agencia = scan.nextLine();
        System.out.print("Digite o numero de sua agência:\n-> ");
        int numeroAgencia = scan.nextInt();
        System.out.print("Digite o seu saldo:\n-> ");
        float saldo = scan.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua  agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponivel para o saque.");
        
    }
}
