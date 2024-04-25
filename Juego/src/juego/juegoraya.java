package juego;
import java.util.Scanner;
public class juegoraya {
    String jugador1;
    String jugador2;
    char j1;
    char j2;
    boolean turno;
    
    public void juegoraya(){
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        this.j1=j1;
        this.j2=j2;
    }
    
    public void construirtablero(){ //Se ha construido un tablero
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Dime las dimensiones que quieres en tu tablero --> ");
        int numero = leer.nextInt();
        int tablero[][]=new int[numero][numero];
     
        for(int i=0; i<=tablero.length; i++){
            for(int j=0; j<=tablero.length; j++){
                System.out.print("0");
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
        j1=leer.next().charAt(0);
        System.out.print("El jugador "+jugador2+" debe de elegir ficha(X/O)...::> ");
        j2=leer.next().charAt(0);
        
        if((j1!='X'||j1!='O') &&(j2!='X'&&j2!='O')){
            System.out.println("¡¡Por favor inserte una ficha!! >:c ");
        }
    }
    
    public void jugando(){ //Inicio del juego
        Scanner leer=new Scanner (System.in);
        int tablero[][]=new int[2][2];
        
        construirtablero();//inicia el método del tablero
        
        System.out.print("Dime quién quiere empezar a jugar diciendo 1 o 2-->.:.:. ");
        int numero=leer.nextInt();
        if(numero==1){ //inicio de turnos
            turno=true;
            System.out.print("Empieza el jugador --> "+jugador1+" ");
        }
        else if (numero==2){
            turno=false;
            System.out.print("Empieza el jugador --> "+jugador2+" ");
        }
        else{
             System.out.println("Sigue las reglas y deja de trolear");
        }
        
        while(turno){
            System.out.println("Elija su posición: ");
            int fila1 = leer.nextInt();
            int columna1 = leer.nextInt();
            tablero[fila1][columna1]=j1;
            
            //gana horizontal
            if((tablero[0][0]==j1) && (tablero[0][1]==j1) && (tablero[0][2])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[0][0]==j2) && (tablero[0][1]==j2) && (tablero[0][2])== j2){
                System.out.println("Gana j2");
            }
            else if((tablero[1][0]==j1) && (tablero[1][1]==j1) && (tablero[1][2])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[1][0]==j2) && (tablero[1][1]==j2) && (tablero[1][2])== j2){
                System.out.println("Gana j2");
            }
            else if((tablero[2][0]==j1) && (tablero[2][1]==j1) && (tablero[2][2])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[2][0]==j2) && (tablero[2][1]==j2) && (tablero[2][2])== j2){
                System.out.println("Gana j2");
            }
            else{
                System.out.println("No hay ganador");
            }
            
            //gana vertical
            if((tablero[0][0]==j1) && (tablero[1][0]==j1) && (tablero[2][0])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[0][0]==j2) && (tablero[1][0]==j2) && (tablero[2][0])== j2){
                System.out.println("Gana j2");
            }
            else if((tablero[0][1]==j1) && (tablero[1][1]==j1) && (tablero[2][1])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[0][1]==j2) && (tablero[1][1]==j2) && (tablero[2][1])== j2){
                System.out.println("Gana j2");
            }
            else if((tablero[0][2]==j1) && (tablero[1][2]==j1) && (tablero[2][2])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[0][2]==j2) && (tablero[1][2]==j2) && (tablero[2][2])== j2){
                System.out.println("Gana j2");
            }
            else{
                System.out.println("No hay ganador");
            }
            
            //gana diagonal
             if((tablero[0][0]==j1) && (tablero[1][1]==j1) && (tablero[2][2])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[0][0]==j2) && (tablero[1][1]==j2) && (tablero[2][2])== j2){
                System.out.println("Gana j2");
            }
            else{
                 System.out.println("No hay ganador");
            }
            //gana diagonal inversa
             if((tablero[2][0]==j1) && (tablero[1][1]==j1) && (tablero[2][0])== j1){
                System.out.println("Gana j1");
            }
            else if((tablero[2][0]==j2) && (tablero[1][1]==j2) && (tablero[2][0])== j2){
                System.out.println("Gana j2");
            }
            else{
                 System.out.println("No hay ganador");
            }
        }
    }
}

