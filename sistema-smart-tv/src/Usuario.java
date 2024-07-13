public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv obj1 = new SmartTv();

        System.out.println("Tv ligada? " + obj1.ligada ); // estado da tv
        System.out.println("Canal atual? " + obj1.canal ); // canal da tv
        System.out.println("Volume atual " + obj1.volume ); // volume da tv

        //teste estado da tv
        obj1.ligar();
        System.out.println("Novo estado -> Tv ligada? " + obj1.ligada );
        
        obj1.desligar();
        System.out.println("Novo estado -> Tv ligada? " + obj1.ligada );

        //teste volume
        obj1.aumentarVolume();
        obj1.aumentarVolume();
        System.out.println("Volume atual " + obj1.volume );

        //teste dos canais
        obj1.aumentarCanal();
        System.out.println("Canal atual? " + obj1.canal ); // canal da tv

        obj1.mudarCanal(80);
        System.out.println("Canal atual? " + obj1.canal);
    }
}
