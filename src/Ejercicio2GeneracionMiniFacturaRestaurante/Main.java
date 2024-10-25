package Ejercicio2GeneracionMiniFacturaRestaurante;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Scanner para recibir datos del usuario de nombre "ingreso"
        Scanner ingreso = new Scanner(System.in);

        //Solicitar datos
        System.out.println("Ingrese el nombre del plato: ");
        String nombrePlato1 = ingreso.nextLine();

        System.out.println("Ingrese el precio del plato: ");
        double precioPlato1 = ingreso.nextDouble();

        System.out.println("Ingrese la cantidad: ");
        int cantidad1 = ingreso.nextInt();

        //crear instancia o el objeto de la clase "Plato" con el nombre "plato1"
        Plato plato1 = new Plato(nombrePlato1, precioPlato1);

        //crear un objeto o instancia de la clase "Factura" con el nombre "factura1"
        Factura factura1 = new Factura(plato1.getNombre(), plato1.getPrecio(), cantidad1);

        //llamar al metodo personalizado "mostrarFactura()"
        factura1.mostrarFactura();

        //cerrar el scanner de nombre "ingreso"
        ingreso.close();







    }
}
