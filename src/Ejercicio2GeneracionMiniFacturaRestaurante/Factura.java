package Ejercicio2GeneracionMiniFacturaRestaurante;

public class Factura {

    //Atributos
    private String nombrePlato;
    private double precioPlato;
    private int cantidad;


    //Constructor
    public Factura(String nombrePlato, double precioPlato, int cantidad){
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
        this.cantidad = cantidad;

    }

    //metodos personalizados

    public double calcularTotal(){
        return precioPlato*cantidad;
    }


    public void mostrarFactura(){
        System.out.println("---Factura---");
        System.out.println("Nombre del plato: "+ nombrePlato);
        System.out.println("Cantidad: "+ cantidad);
        System.out.println("Precio por plato: "+ precioPlato);
        System.out.println("Total: "+ calcularTotal());
        System.out.println("------------");

    }

}
