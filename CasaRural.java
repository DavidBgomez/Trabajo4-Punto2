package Main;

public class CasaRural extends Casa {
    protected static double valorArea =1500000;
    protected int distanciaCabecera;
    protected int altitud;

    public CasaRural(int distanciaCabecera, int altitud, int numeroPisos, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(numeroPisos, identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal =" + distanciaCabecera + "Km");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros");
        System.out.println();
    }
}
