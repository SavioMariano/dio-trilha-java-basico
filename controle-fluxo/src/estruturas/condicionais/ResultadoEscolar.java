package estruturas.condicionais;
public class ResultadoEscolar{
    public static void main(String[] args) {
        
        int nota = 5;

        if(nota >= 7)
         System.out.println("aprovado"); 

        else if (nota >= 5 && nota < 7) {
         System.out.println("prova de recuperação");
        }

        else 
         System.out.println("reprovado");

        /* 
        exemplo de controle composto
        if(nota >= 7)
         System.out.println("aprovado"); 

        else 
         System.out.println("reprovado");
         */

         /*
          exemplo de condição ternaria simples
         String resultado = nota <= 7 ? "Aprovado" : "Reprovado";
            System.out.println(resultado);
          */
          
          /*
          exemplo de condição ternaria composta
         String resultado = nota <= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
                System.out.println(resultado);
          */
         
    }
    
}