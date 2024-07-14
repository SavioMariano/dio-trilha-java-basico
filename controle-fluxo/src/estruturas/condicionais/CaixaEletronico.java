package estruturas.condicionais;
public class CaixaEletronico {
    //Exemplo de controle de fluxo simples.
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo: " + saldo);
        
        }else
            System.out.println("saldo insuficente");
       
        
    }
}
