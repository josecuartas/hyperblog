package Messi;

public class Main {
    public static void main(String[] args) {

        Iequipo equipo=EquipoFactory.crearEquipo(EquipoFactory.equipo.BARCELONA);
        Messi messi=new Messi(equipo);
        messi.jugar();
    }
}
