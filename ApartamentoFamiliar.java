package Main;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int valorAdministracion, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion = $" + valorAdministracion);
        System.out.println();
    }
    
}
