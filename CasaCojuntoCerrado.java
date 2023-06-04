package Main;

public class CasaCojuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaCojuntoCerrado(int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos, int numeroPisos, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(numeroPisos, identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion = $" + valorAdministracion);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }   
}
