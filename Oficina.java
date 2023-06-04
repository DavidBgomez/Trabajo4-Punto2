package Main;

public class Oficina extends Local{
    protected static double valorArea = 3500000;
    protected boolean esGobierno;

    public Oficina(boolean esGobierno, tipo tipoLocal, int identificadorInmobiliario, int area, String direccion) {
        super(tipoLocal, identificadorInmobiliario, area, direccion);
        this.esGobierno = esGobierno;
    }
    
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
