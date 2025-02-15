package estruturas.exceçoes;

public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("8888888");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep não corresponde as regras de negócio");
        }
    }

   static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

    
}
