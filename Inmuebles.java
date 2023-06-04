package Main;

public class Inmuebles {
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmuebles(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    
    public double calcularPrecioVenta (double valorArea){
        double precioVenta = area*valorArea;
        return precioVenta;
    }
    
    public void imprimir(){
        System.out.println("Identificador inmobiliario =" + identificadorInmobiliario);
        System.out.println("Area =" + area);
        System.out.println("Direccion =" + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    } 
}
