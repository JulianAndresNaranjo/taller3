package co.edu.uniquindio.poo;

public class Triangulo extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular {
    //cosntructor
    public Triangulo(double lado) {
        super(lado);
    }
    
    //metodos
    public double calcularArea() {
        return (lado*lado)/2;
    }
 
    public double calcularPerimetro() {
        return lado+lado+lado;
    }

    public String calcularAngulo() {
        return "60";
    }

    public double calcularLongitud() {
        return lado * Math.sqrt(3) / 2;
    }
    public double calcularAltura() {
        return (lado * Math.sqrt(3)) / 2.0;
    }
}
