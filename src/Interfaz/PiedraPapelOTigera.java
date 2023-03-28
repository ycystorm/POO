package Interfaz;


import java.util.Random;
import java.util.Scanner;


public class PiedraPapelOTigera implements Juego{
    //Atributos
 private int azar;
 private String jugador;
 private int eleccion;
 
 //objeto para capturar los datos
 Scanner captura=new Scanner(System.in);
//solicitar los datos

    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        jugador=captura.next();
    }

  
    public void jugar() {
        System.out.println(jugador+"Realice su elección \n1.piedra \n2.papel\n3.tijera");
        eleccion=captura.nextInt();
        Random aleatorio=new Random();
        azar=aleatorio.nextInt(3)+1;
        System.out.println("ha registrado su respuesta ");
    }


    public void finalizar() {
       if (azar == 1 && eleccion == 1) {
            System.out.println("respuesta maquina  tijera");
            System.out.println(jugador + " has ganado la respuesta de la maquina es " + azar + " la tuya es " + eleccion);
        } else if (azar == 2 && eleccion == 1) {
            System.out.println("respuesta maquina papel");
            System.out.println(jugador + "has perdido la respuesta de la maquina es " + azar + " la tuya es "
                    + eleccion );
        } else if (azar == 3 && eleccion == 1) {
            System.out.println(jugador + " has empatado la respuesta de la maquina es " + azar + " la tuya es "
                    + eleccion );
        } else if (azar == 2 && eleccion == 2) {
            System.out.println("respuesta maquina piedra");
            System.out.println(jugador + " has ganado la respuesta de la maquina es " + azar + " la tuya es "
                    + eleccion );
        } else if (azar == 1 && eleccion == 2) {
            System.out.println("respuesta maquina  tijera");
            System.out.println(jugador + " has perdido la respuesta de la maquina es " + azar + " la tuya es "
                    + eleccion );
        } else if (azar == 3 && eleccion == 2) {
            System.out.println(" has empatado la respuesta de la maquina es " + azar + " la tuya es " + eleccion
                   );
        } else if (azar == 3 && eleccion == 3) {
            System.out.println("respuesta  maquina piedra");
            System.out.println(jugador+ " has perdido la respuesta de la maquina es " + azar + " la tuya es "
                    + eleccion );
        } else if (azar == 2 && eleccion == 3) {
            System.out.println("respuesta maquina papel");
            System.out.println(jugador + " has ganado la respuesta de la maquina es " + azar + " la tuya es "
                    + eleccion );
        } else if (azar == 1 && eleccion == 3) {
            System.out.println(jugador + " has empatado la respuesta de la maquina es " + azar + " la tuya es "
                    + eleccion );
        }
    }
    
}