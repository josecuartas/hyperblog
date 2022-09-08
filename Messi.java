package Messi;

public class Messi {
    Iequipo iequipo;
    public Messi(Iequipo equipo){
        iequipo=equipo;
    }

    public void jugar(){
        iequipo.jugar();
    }
}
