
package juego;

public class Juego extends juegoraya{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego1 = new Juego ();
        
        //Se muestra el nombre de los jugadores
        juego1.jugadores();
        //Se muestra las fichas de los jugadores
        juego1.fichas();
        //Iniciamos el juego
        juego1.jugando();
    }

    
}
