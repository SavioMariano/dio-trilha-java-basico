package terceirodesafiocodigo;

import java.util.Scanner;

public class transacao {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double transacaoUm = scanner.nextDouble();
        double transacaoDois = scanner.nextDouble();
        double transacaoTres = scanner.nextDouble();
        // TODO: Na linha abaixo, realize o cálculo do saldo final:

        if (transacaoUm > 0.0) {
            saldoInicial += transacaoUm;
        }
        else{
            saldoInicial -= transacaoUm
        }

        if (transacaoDois > 0.0) {
            saldoInicial += transacaDois;
        }
        else{
            saldoInicial -= transacaoDois
        }

        if (transacaoTres > 0.0) {
            saldoInicial += transacaoTres;
        }
        else{
            saldoInicial -= transacaoTres;
        }
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
