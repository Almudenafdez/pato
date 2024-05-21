/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoxml;
import javax.xml.bind.annotation.*;
import java.io.File;
import javax.xml.bind.*;

@XmlRootElement(name="Juegoxml")
public class Juegoxml extends juegoraya{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        Juegoxml juego1 = new Juegoxml();
        juego1.jugadores();//Se muestra el nombre de los jugadores
        juego1.fichas();//Se muestra las fichas de los jugadores
        juego1.jugando();//Iniciamos el juego
        juego1.otrojuego(true);//Iniciamos el otro juego si deseamos cambiarlo
        
        JAXBContext contexto=JAXBContext.newInstance(juegoraya.class); //Llama a la clase
        Unmarshaller um = contexto.createUnmarshaller();
        Juegoxml jueguitoz = (Juegoxml) um.unmarshal(new File("juegoraya.xml"));
        System.out.println(jueguitoz);
    }   
    
}
