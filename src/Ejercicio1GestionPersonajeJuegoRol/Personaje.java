package Ejercicio1GestionPersonajeJuegoRol;

public class Personaje {

    //Atributos
    private String nombre;
    private int anioNacimiento;
    private String telefono;

    //Metodo constructor
    public Personaje(String nombre, int anioNacimiento, String telefono ){
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.telefono = telefono;

    }

    //metodos getters y setters

    //getters

    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    //setters

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    //Metodo personalizado



}
