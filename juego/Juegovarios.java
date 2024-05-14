/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Gunte
 */
public class Juegovarios extends juegoraya{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juegovarios juego1 = new Juegovarios ();
        
        //Se muestra el nombre de los jugadores
        juego1.jugadores();
        //Se muestra las fichas de los jugadores
        juego1.fichas();
        //Iniciamos el juego
        juego1.jugando();
        //Iniciamos el otro juego si deseamos cambiarlo
        juego1.otrojuego(true);
    }

    
}
