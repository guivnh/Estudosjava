public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ON? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("O volume Atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Status Atual -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.print("Status Atual -> TV ligada? " + smartTv.ligada);

    }
}
