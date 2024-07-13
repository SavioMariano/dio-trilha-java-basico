public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 40; 

    public void ligar(){
        ligada = !ligada;
    }

    public void desligar(){
        ligada = false;
    }
    
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int numeroCanal){
        canal = numeroCanal;
    }

    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }
}
