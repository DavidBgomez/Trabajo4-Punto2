package Main;

public class Apartamento extends InmuebleVivienda{

    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    
    public void imprimir(){
        super.imprimir();
    }
}
