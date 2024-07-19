package produto;

import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Metodos da interface ReprodutorMusical.
    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar(){
        System.out.println("PAUSANDO MUSICA");
    }

    public void selecionarMusica(String nomeMusica){
        System.out.println("A MUSICA " + nomeMusica + " FOI SELECIONADA");
    }

    //Metodos da interface AparelhoTelefonico.
    public void ligar(String numeroTelefone){
        System.out.println("LIGANDO PARA " + numeroTelefone);
    }

    public void atender(){
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    //Metodos da interface NavegadorInternet.
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PAGINA " + url );
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }
}
