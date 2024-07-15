public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio do programa no método main.");
        a();
        System.out.println("Finalização do programa no método main.");
    }
    public static void a(){
        System.out.println("inicio do programa no método a");
        b();
        System.out.println("Finalização do programa no método a");
    }
    public static void b(){
        System.out.println("inicio do programa no método b");
        for(int i = 0; i <= 4; i++) System.out.println(i);
            c();
        System.out.println("Finalização do programa no método b ");
    }

    public static void c(){
        System.out.println("inicio do programa no método c");
        //Thread.dumpStack();
        System.out.println("Finalização do programa no método c");
    }
}
