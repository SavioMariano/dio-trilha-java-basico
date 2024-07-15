package estruturas.exceçoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{

        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " sua idade é " + idade );

        scanner.close();
        
        }
        catch (InputMismatchException e){
            System.out.println("Ocorreu um erro na hora de digitar sua idade.");
        }
    }
    
}