package POO;

public class Triangulo extends Figura {
    //atributos
    private double base;
    private double altura;
//metodo constructor 
   public Triangulo(double base, double altura){
    this.base=base;
    this.altura=altura;
   }
   
    //getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void calcularArea() {
        double area=0;
        area=(base*altura)/2;
        System.out.println("la base es "+base+"la altura es  "+altura+"el area es "+area);
    }

   
}
