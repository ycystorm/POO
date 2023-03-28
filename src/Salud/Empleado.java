package Salud;


public class Empleado  extends persona{
    //atributosd  de la subclase
     private String cargo;
     private int valorhora;
     private int horastrabajadas;
    private String departamento;

     public Empleado(String tipoDoc,String nombre,String apellido,String sexo,int documento,int peso,int edad,double estatura,String cargo,int valorhora,int horastrabajadas,String departamento){
        super( tipoDoc, nombre, apellido, sexo, documento, peso, edad, estatura);
        this.cargo=cargo;
        this.valorhora=valorhora;
        this.horastrabajadas=horastrabajadas;
        this.departamento=departamento;
     }
     //metodos
     public void calcularHorarios(){
        double honorarios=0;
        double reteica=0;
        double valorTotal=0;
        valorTotal=(valorhora*horastrabajadas);
        reteica=(valorTotal*0.966)/100;
        honorarios=valorTotal-reteica;
        System.out.println("reto 3");
        System.out.println("el tipo de documento es "+getTipoDoc());
        System.out.println("tu numero de documento es "+getDocumento());
        System.out.println("tu nombre es "+getNombre());
        System.out.println("tu apellido  es "+getApellido());
        System.out.println("tu cargo  es "+cargo);
        System.out.println("tus horas trabajadas son  "+horastrabajadas);
        System.out.println("tu valor por hora es  "+valorhora);
        System.out.println("tus honorarios son  "+honorarios);
     }
     
   

}
