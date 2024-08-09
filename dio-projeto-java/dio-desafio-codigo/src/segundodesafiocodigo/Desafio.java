    package segundodesafiocodigo;

    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class Desafio {

        public static void main(String[] args) {
            // Lendo os dados de Entrada:
            Scanner scanner = new Scanner(System.in);
            String titular = scanner.next();
            int numeroConta = scanner.nextInt();
            double saldo = scanner.nextDouble();
            double taxaJuros = scanner.nextDouble();

            ContaPoupanca contaPoupanca = new ContaPoupanca(titular, numeroConta, saldo, taxaJuros);

            System.out.println("Conta Poupanca:");
            contaPoupanca.exibirInformacoes();

            scanner.close();
        }
    }

    class ContaBancaria {
        protected int numero;
        protected String titular;
        protected double saldo; 

        public ContaBancaria(String titular, int numero, double saldo) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
        }

        public void exibirInformacoes() {
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            System.out.println(titular);
            System.out.println(numero);
            System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
        }
    }

    class ContaPoupanca extends ContaBancaria {
        private double taxaJuros;

        public ContaPoupanca(String titular, int numero, double saldo ,double taxaJuros) {
            super(titular, numero, saldo);
            this.taxaJuros = taxaJuros;
        }

        public void exibirInformacoes() {
            super.exibirInformacoes();
            System.out.println("Taxa de juros: " + taxaJuros + "%");
        }
    }