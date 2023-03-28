package Salud;

import java.util.Scanner;

public class persona {
    private String tipoDoc;
    private String nombre;
    private String apellido;
    private String sexo;
    private int documento;
   private int peso;
    private int edad;
    private double estatura;
     public persona(String tipodoc2, String nombre2, String apellido2, String sexo2, int documento2, int peso2,
            int edad2, double estatura2) {
    }


        // creo el metodo constructor con parametros de la clase persona: con nombres iguales  a los atributos utilizamos la palabra reservada this 
       /*  public void persona(String tipodoc,String nombre,string apellido,String sexo,int documento,int peso,int edad,double estatura){
        this.tipoDoc=tipodoc;
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
        this.documento=documento;
        this.peso=peso;
        this.edad=edad;
        this.estatura=estatura;
    }
      */
    
  // metodos geters y setters
  
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }  
    // creo el metodo constructor con parametros de la clase persona: con nombres diferentes a los atributos 

   /*  public void persona(String tipodoc1,String nombre1,string apellido1,String sexo1,int documento1,int peso2,int edad1,double estatura2){
        tipoDoc=tipodoc1;
        nombre=nombre1;
        apellido=apellido1;
        sexo=sexo1;
        documento=documento1;
        peso=peso2;
        edad=edad1;
        estatura=estatura2;

    }*/

   //metodo constructor vacio ->no tiene parametros
    /*   public void persona(){
    }*/

    //metodos 
    public void pedirDatos(){
        System.out.println("reto 1");
        Scanner hospital= new Scanner(System.in);
        System.out.println("por favor ingrese el tipo de documento");
        tipoDoc=hospital.next();
        System.out.println("por favor ingresar el numero de  documento");
        documento=hospital.nextInt();
        System.out.println("por favor ingrese su nombre");
        nombre=hospital.next();
        System.out.println("por favor ingrese su apellido ");
        apellido=hospital.next();
       System.out.println("por favor su peso ");
       peso=hospital.nextInt();
       System.out.println("por favor ingrese su estatura");
        estatura=hospital.nextDouble();
        System.out.println("por favor ingrese su edad ");
        edad=hospital.nextInt();
        System.out.println("por favor ingrese su sexo ");
        sexo=hospital.next();
        hospital.close();
    }
    public void mostrarPersona(){
        System.out.println("datos personales");
        System.out.println("su tipo de documento "+ tipoDoc);
        System.out.println("su documento es "+ documento);
        System.out.println("su nombre es  "+ nombre);
        System.out.println("su apellido es  "+ apellido);
        //System.out.println("su peso es "+ peso);
       // System.out.println("su estatura es  "+ estatura);
        System.out.println("su edad es  "+ edad);
        System.out.println("tipo de  sexo   "+ sexo);
    }
    //metodo 
    public double calcularlmc(double estatura1,int peso2 ){
      double pesoActual;
        pesoActual=(peso/(estatura*estatura));
        return pesoActual;
    }
    public void mayorEdad(){
        System.out.println("edad");
        if(edad>17){
            System.out.println("usted es mayor de edad");
        }
        else if(edad<18){
            System.out.println("usted es menor de edad");
        }
    }
    
    
}
