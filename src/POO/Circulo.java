package POO;

public class Circulo extends Figura {
    private double radio;
   public  Circulo(double radio ){
    this.radio=radio;
   }
   
    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void calcularArea() {
        double pi=3.1416;
        double area=0;
        area=(pi*(radio*radio));
        System.out.println("el radio es "+radio+"pi es "+pi+"el area es "+area);
    }

   
}
