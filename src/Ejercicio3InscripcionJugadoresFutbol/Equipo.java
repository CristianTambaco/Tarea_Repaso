package Ejercicio3InscripcionJugadoresFutbol;

public class Equipo {

    // Atributos
    private String nombreEquipo;
    private Jugador jugador;


    // Constructor
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }


    //Metodos personalizados

    //------------------------------------------------------
    public void inscribirJugador(String nombre, int anioNacimiento, int numeroCamiseta) {
        jugador = new Jugador(nombre, anioNacimiento, numeroCamiseta);
    }


    //mostrar la información del jugador inscrito
    public void mostrarJugador() {
        if (jugador != null) {
            jugador.mostrarInfo();
        } else {
            System.out.println("No hay jugadores inscritos en el equipo.");
        }
    }

    //obtener el jugador inscrito
    public Jugador obtenerJugador() {
        return jugador;
    }

    //-------------------------------------------------------------------------
}
