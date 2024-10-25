package Ejercicio1GestionPersonajeJuegoRol;

public class Main {

    public static void main(String[] args){

        //Crear un objeto de la clase "Personaje" con el nombre "Personaje1" con datos quemados
        Personaje Personaje1 = new Personaje("Paul", 2017, "654365");

        //Imprimir usando getters
        System.out.println("El nombre es: "+ Personaje1.getNombre());
        System.out.println("El anio de nacimiento es: "+ Personaje1.getAnioNacimiento());
        System.out.println("El telefono es: "+ Personaje1.getTelefono());

        //Setter para modificar el numero de telefono anterior a uno nuevo
        Personaje1.setTelefono("55555886");

        //Imprimir
        System.out.println("El telefono usando setter: "+ Personaje1.getTelefono());

    }


}
