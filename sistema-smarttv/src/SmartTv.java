public class SmartTv {

    static boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada= false;
    }

    public void aumentarVolume(){
        volume = volume++;
    }

    public void diminuirVolume(){
        volume = volume--;
    }
}