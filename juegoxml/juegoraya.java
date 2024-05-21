/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoxml;

import java.util.Random;
import java.util.Scanner;
import javax.xml.bind.annotation.*;

@XmlRootElement (name="juegoraya")
@XmlType (propOrder={"jugador1","jugador2","j1","j2","turno","tablero","jugador1","terminado"})
@XmlAccessorType(XmlAccessType.FIELD)

public class juegoraya {
    @XmlElement(name="jugador1")
    private String jugador1;

    @XmlElement(name="jugador2")
    private String jugador2;

    @XmlElement(name="j1")
    private int j1;

    @XmlElement(name="j2")
    int j2;

    @XmlElement(name="turno")
    boolean turno;

    @XmlElement(name="tablero")
    int tablero[][];

    @XmlElement(name="terminado")
    boolean terminado;

public void juegoraya(){
    this.jugador1=jugador1;
    this.jugador2=jugador2;
    this.j1=j1;
    this.j2=j2;
}

public void construirtablero(int a){ //Se ha construido un tablero
    if(a!=1){
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime las dimensiones que quieres en tu tablero --> ");
        int numero = leer.nextInt();
        this.tablero=new int[numero][numero];
    }
    for(int i=0; i<tablero.length; i++){
        for(int j=0; j<tablero.length; j++){
            if(a==1){
                System.out.print(this.tablero[i][j]);
            }
            else{
                this.tablero[i][j]=0;
                System.out.print(this.tablero[i][j]);
            }
        }
    System.out.println("\n");
    }
}

public void jugadores(){ //Datos jugador nombre
    Scanner leer=new Scanner (System.in);
    System.out.print("Dime el nombre del primer jugador --> ");
    jugador1=leer.nextLine();
    System.out.print("Dime el nombre del segundo jugador --> ");

    jugador2=leer.nextLine();
    if(jugador1==null || jugador2==null){
        System.out.println("¡¡Por favor inserte un nombre!! >:c ");
    }
}

public void fichas(){ //Datos jugador fichas
    Scanner leer=new Scanner (System.in);
    System.out.print("El jugador "+jugador1+" debe de elegir ficha(X/O)...::> ");
    j1=leer.nextInt();
    System.out.print("El jugador "+jugador2+" debe de elegir ficha(X/O)...::> ");
    j2=leer.nextInt();
}

public void comprobar(int jugador, int contador){
    int j=0;
    int k=0;
    int contadorfila=0;
    int contadorcolumna=0;
    int contadordia=0;
    int contadordiainv=0;
    
while(!terminado && j < this.tablero.length){
    contadorfila=0;
    contadorcolumna=0;
    contadordia=0;
    contadordiainv=0;
    k=0;
    
while(k < this.tablero.length){
    contadorfila=(this.tablero[j][k]==jugador)?contadorfila+1:contadorfila;
    contadorcolumna=(this.tablero[k][j]==jugador)?contadorcolumna+1:contadorcolumna;
    contadordia=(this.tablero[k][k]==jugador)?contadordia+1:contadordia;
    contadordiainv=(this.tablero[this.tablero.length-1-k][k]==jugador)?contadordiainv+1:contadordiainv;
    k++;
}

terminado=(contadorfila==this.tablero.length || contadorcolumna==this.tablero.length ||contadordia==this.tablero.length ||contadordiainv==this.tablero.length);
    j++;
}

if(terminado){
    System.out.println(jugador+ " ganó");
    }
}

public void jugando(){ //Inicio del juego
    Scanner leer=new Scanner (System.in);
    construirtablero(0);//inicia el método del tablero
    System.out.print("Dime quién quiere empezar a jugar diciendo 1 o 2-->.:.:. ");
    int numero=leer.nextInt();
        if(numero==1){ //inicio de turnos
            turno=true;
            System.out.print("Empieza el jugador --> "+jugador1+" ");
        }
        else if (numero==2){
            turno=true;
            System.out.print("Empieza el jugador --> "+jugador2+" ");
        }
        else{
            System.out.println("Sigue las reglas y deja de trolear");
        }
        
        while(!terminado){
            System.out.println("Elija su posición: "+jugador1);
            int fila1 = leer.nextInt();
            int columna1 = leer.nextInt();
            tablero[fila1][columna1]=j1;
            construirtablero(1);
            if(terminado){
                comprobar(j1);
            }
            else{
                System.out.println("Elija su posición: "+jugador2);
            int fila2 = leer.nextInt();
            int columna2 = leer.nextInt();
            tablero[fila2][columna2]=j2;
            construirtablero(1);
            comprobar(j2);
            }
        }
}

public void otrojuego(boolean jugar){
    Scanner leer=new Scanner(System.in);

    while(jugar){
        System.out.print("¿Desea cambiar de juego? Pulse 0 -->");
        int cambio = leer.nextInt();
            if(cambio==0){
            System.out.println("Este es el juego de adivinar el numero random ");
            Random rd = new Random();
            int aleatorio=0;
            int usuarionum=0;
            aleatorio=rd.nextInt(101);
            System.out.println("Dime un número --> ");
                while(aleatorio!=(usuarionum=leer.nextInt())){
                    if(usuarionum<aleatorio){
                        System.out.println("No has acertado, es mayor ");
                    }
                    else if(usuarionum>aleatorio){
                        System.out.println("No has acertado, es menor ");
                    }
                    else if(usuarionum==aleatorio){
                        System.out.println("Has acertado el numero");
                    }
                }
            }
        }
    }
}

