package Main;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;

    public CasaIndependiente(int numeroPisos, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(numeroPisos, identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    
    public void imprimir (){
        super.imprimir();
        System.out.println();
    }
    
}
