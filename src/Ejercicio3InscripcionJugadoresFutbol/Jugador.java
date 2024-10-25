package Ejercicio3InscripcionJugadoresFutbol;

public class Jugador {
    //atributos
    private String nombre;
    private int anioNacimiento;
    private int numeroCamiseta;

    //constructor
    public Jugador(String nombre, int anioNacimiento, int numeroCamiseta){
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.numeroCamiseta = numeroCamiseta;
    }

    // metodos getters                                                  //(atributos)
    public String getNombre(){
        return nombre;
    }

    public int getAnioNacimiento(){
        return anioNacimiento;
    }

    public int getNumeroCamiseta(){
        return numeroCamiseta;
    }


    //metodos setters

    public void setNumeroCamiseta(int numeroCamiseta){                         //(Constructor)
        this.numeroCamiseta = numeroCamiseta;

    }

    //metodos personalizados

    public void mostrarInfo(){
        System.out.println("El nombre es: "+ nombre);
        System.out.println("El anio de nacimiento es: "+ anioNacimiento);
        System.out.println("El numero de camiseta es: "+ numeroCamiseta);

    }


    public double calcularVenta(int cantidad){        //variable cualquiera con el nombre "cantidad"

        double precioCamiseta = 25;    //una variable cualquiera con el nombre "precioCamiseta" con un valor de 25
        return cantidad * precioCamiseta;               //multiplicacion

    }



}
