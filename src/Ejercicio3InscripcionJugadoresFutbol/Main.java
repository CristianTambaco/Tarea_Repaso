package Ejercicio3InscripcionJugadoresFutbol;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        //objeto Scanner de nombre "ingreso"
        Scanner ingreso = new Scanner(System.in);

        //Solicitar nombre del equipo
        System.out.println("Ingrese el nombre del equipo: ");
        String nombreEquipo = ingreso.nextLine();

        //instanciar o crear objeto de la clase "Equipo" con el nombre "equipo1"
        Equipo equipo1 = new Equipo(nombreEquipo);



        //Solicitar datos del jugador

        System.out.println("Ingrese el nombre del jugador: ");
        String nombreJugador = ingreso.nextLine();

        System.out.println("Ingrese el anio de nacimiento: ");
        int anioNacimiento = ingreso.nextInt();

        System.out.println("Ingrese el numero de camiseta: ");
        int numeroCamiseta = ingreso.nextInt();


        //inscribir jugador
        equipo1.inscribirJugador(nombreJugador, anioNacimiento, numeroCamiseta);

        //mostrar informacion
        System.out.println("Informacion del jugador: ");
        equipo1.mostrarJugador();


        System.out.println("Cambiar el numero de camiseta? (1 para SI/0 para NO)");
        int cambiarNumero = ingreso.nextInt();


        if (cambiarNumero == 1){
            System.out.println("Ingrese el nuevo numero de camiseta: ");
            int nuevoNumeroCamiseta = ingreso.nextInt();
            equipo1.obtenerJugador().setNumeroCamiseta(nuevoNumeroCamiseta);


        }

        System.out.println("Informacion actualizada: ");
        equipo1.mostrarJugador();

        // Solicitar cantidad de camisetas a vender y calcular el total
        System.out.println("\n Ingrese la cantidad de camisetas a vender:");
        int cantidadCamisetas = ingreso.nextInt();

        double totalVenta = equipo1.obtenerJugador().calcularVenta(cantidadCamisetas);
        System.out.println("El total de la venta es: $" + totalVenta);

        // Cerrar el escáner de nombre "ingresp"
        ingreso.close();



    }
}
