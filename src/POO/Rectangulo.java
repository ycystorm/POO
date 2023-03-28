package POO;

public class Rectangulo extends Figura{
    private double largo;
    private double ancho;
   public  Rectangulo(double largo, double ancho){
    this.largo=largo;
    this.ancho=ancho;
   }
   
    //getters y setters
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public void calcularArea() {
        double area=0;
        area=largo*ancho;
        System.out.println("el largo  es "+largo+"el ancho  es  "+ancho+"el area es "+area);
    }

   
}
