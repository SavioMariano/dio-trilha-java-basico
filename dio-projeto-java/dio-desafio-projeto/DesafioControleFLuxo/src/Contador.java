import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parametro:");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O primeiro parametro deve ser menor que o segundo");
        }
    }

    static void contar(int minimo, int maximo) throws ParametrosInvalidosException{
        if (minimo > maximo) {
            throw new ParametrosInvalidosException();
        }

        int incio = maximo - minimo;

        for (int i = 1; i < incio; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }

}