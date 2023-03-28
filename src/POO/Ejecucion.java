package POO;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        int eleccion,respuesta;
        double base,altura,largo,ancho,radio;
        System.out.println("menu");
        Scanner elec=new Scanner(System.in);
        do{
            System.out.println(" elija  la figura que desea para calculara el area triangulo 1, rectangulo 2,circulo 3");
            eleccion=elec.nextInt();
            if(eleccion==1){
                System.out.println("digita el base");
                base=elec.nextDouble();
                System.out.println("cual es la altura ");
                altura=elec.nextDouble();
                //creamos el objeto de la clase triangulo
                Triangulo tri=new Triangulo(base, altura);
                tri.calcularArea();
            }
            else if(eleccion==2){
                System.out.println("digita el largo");
                largo=elec.nextDouble();
                System.out.println("cual es ancho ");
                ancho=elec.nextDouble();
                 //creamos el objeto de la clase rectangulo
                 Rectangulo rec=new Rectangulo(largo, ancho);
                 rec.calcularArea();
            }

        else if(eleccion==3){
            System.out.println("digita el radio");
            radio=elec.nextDouble();
            //creamos el objeto de la clase rectangulo
            Circulo cir=new Circulo(radio);
            cir.calcularArea();
        }
        System.out.println("quieres elegir otra figura: si 1, no 2");
        respuesta=elec.nextInt();
        }while(respuesta==1);
        elec.close();
    }
}
