package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.persona;

public class Inicio {
    public static void main(String[] args) {
        //declaro para las variables de retorno 
        double estatura1,pesoActual;
        int peso2;
        int peso,edad,valorhora,horastrabajadas,documento;
        String nombre,apellido,sexo,cargo,departamento,tipoDoc;
        double estatura;
        //reto 3 
        Scanner lectura=new Scanner(System.in);
        System.out.println("tipo documento");
        tipoDoc=lectura.next();
        System.out.println(" ingrese el nombre");
        nombre=lectura.next();
        System.out.println("ingrese el apellido");
        apellido=lectura.next();
        System.out.println("ingrese el sexo");
        sexo=lectura.next();
        System.out.println("ingrese el documento");
        documento=lectura.nextInt();
        System.out.println("ingrese el peso");
        peso=lectura.nextInt();
        System.out.println("ingrese la edad");
        edad=lectura.nextInt();
        System.out.println("ingrese la estatura");
        estatura=lectura.nextDouble();
        System.out.println("ingrese el cargo");
        cargo=lectura.next();
        System.out.println("ingrese el valor de la hora ");
        valorhora=lectura.nextInt();
         System.out.println("ingrese el valor de las horas trabajadas");
         horastrabajadas=lectura.nextInt();
         System.out.println("ingrese el departamento");
         departamento=lectura.next();       

         //crear un objeto-> instancia de una clase 
         Empleado trabajo=new Empleado(tipoDoc,nombre,apellido,sexo,documento,peso,edad,estatura,cargo,valorhora,horastrabajadas,departamento);
        //tomo la informacion 
        System.out.println("por favor ingrese la estatura");
        estatura1=lectura.nextDouble();
        System.out.println("por favor ingrese el peso");
        peso2=lectura.nextInt();


        //metodo escaner para obtener los parametros 
        trabajo.pedirDatos();
        trabajo.mostrarPersona();
       pesoActual=trabajo.calcularlmc(estatura1, peso2);
        trabajo.mayorEdad();
        trabajo.calcularHorarios();



        //inicio del reto 2 


        if(pesoActual<20){
            System.out.println(" peso bajo ");
        }
        else if(pesoActual>=20 && pesoActual<=25){
            System.out.println("pesoideal");
        }
        else if(pesoActual>25){
            System.out.println("sobrepeso");
        }

lectura.close();
        
    }
}
