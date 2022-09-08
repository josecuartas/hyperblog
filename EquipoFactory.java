package Messi;

public class EquipoFactory {
    enum equipo{BARCELONA,JUVENTUS};
    static Iequipo iequipo;
    public static Iequipo crearEquipo(equipo e){
        //Iequipo iequipo;
        switch (e){
            case BARCELONA:
                iequipo=new Barcelona();
                break;
            default:
                iequipo=new Juventus();
                break;
        }
        return iequipo;
    }
}
