package Main;

public class CasaUrbana extends Casa {

    public CasaUrbana(int numeroPisos, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(numeroPisos, identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    
    public void imprimit(){
        super.imprimir();
    }
}
