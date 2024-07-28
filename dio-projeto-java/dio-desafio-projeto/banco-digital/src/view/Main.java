package view;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        
        Cliente savio = new Cliente();
        savio.setNome("Savio Mariano");

        Cliente larissa = new Cliente();
        larissa.setNome("Larissa Rego Freitas");

        Conta corrente = new ContaCorrente(savio);
        corrente.depositar(100);
        
        Conta poupanca = new ContaPoupanca(larissa);
        corrente.transferir(poupanca, 100);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}