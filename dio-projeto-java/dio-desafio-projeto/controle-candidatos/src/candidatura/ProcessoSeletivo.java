package candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) {
       String candidatos[] = {"Lucas","Marcelo","Larissa","Savio","Mateus","Bryan"};
       
       for (String candidato : candidatos) {
            entrarEmContato(candidato);        
       }

    }

    static void entrarEmContato(String candidato){
        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativaRealizada++;
            }else{
                System.out.println("CONTATADO COM SUCESSO");
            }

        } while (continuarTentando && tentativaRealizada < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com o candidato " + candidato + " numero de tentativas " + tentativaRealizada);
        }else{
            System.out.println("Não conseguimos contatar o candidato " + candidato + " numero de tentativas " + tentativaRealizada);
        }
    }

    static boolean atender(){
        int max = 3;
        int min = 1;
        int intervalo = max - min + 1;
        int tentativa = (int) (Math.random() * intervalo ) + min;
        if (tentativa == 1) {
            return true;
        }else{
            return false;
        }
    }

        
    static void imprimirSelecionados(){
        String candidatos[] = {"Lucas","Marcelo","Larissa","Savio","Mateus","Bryan"};

        System.out.println("Imprimindo lista de candidatos informando indices dos elemento");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + (i + 1) + " é " + candidatos[i]);
    }
            System.out.println("Informando de forma abreviada sem o uso do indice");
        for (String candidato : candidatos) {
            System.out.println("o candidato de n°" + " é " + candidato );
    }

    }
        

    static void selecionarCandidato(){
        String candidatos[] = {"Lucas","Marcelo","Larissa","Savio","Mateus","Bryan"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
            
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        String candidato = candidatos[candidatosAtual];
        double valorPretendido = valorPretendido();

            System.out.println("O candidato " +  candidato + " solicitou este valor " + valorPretendido);
        if (salarioBase > valorPretendido) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }
                candidatosAtual++;
    }
    
    }

    static double valorPretendido(){
        int max = 2200;
        int min = 1800;
        int intervalo = max - min + 1;
        return (Math.random() * intervalo ) + min;
    
    }


    static void analisarCandidato(double salarioPretendio){
        double salarioBase = 2000.0;
        if (salarioPretendio < salarioBase) {
            System.out.println("LIGAR PARA CANDIDATO.");
        }else if (salarioBase == salarioPretendio) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS.");
        }

    }
}