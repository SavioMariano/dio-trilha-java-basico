package primeirodesafiocodigo;

import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        String condicao = (idade >= 18) ? "Voce esta elegivel para criar uma conta bancaria." : "Voce nao esta elegivel para criar uma conta bancaria.";

        System.out.println(condicao);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}