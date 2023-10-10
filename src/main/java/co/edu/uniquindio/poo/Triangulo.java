package co.edu.uniquindio.poo;

public class Triangulo extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular {


    public Triangulo(double lado,double area) {
        super(lado);
    }

    public double calcularArea() {
       
    return (lado*lado)/2;
    }
 
    public double calcularPerimetro() {
    return lado+lado+lado;
    }

    public String calcularAngulo() {
        return "un angulo de un triangulo regular es igual a 60 dando una suma de 180 entre todos";
    }

    public double calcularLongitud() {
         return lado * Math.sqrt(3) / 2;
    }
    public double calcularAltura() {
        return (lado * Math.sqrt(3)) / 2.0;
    }
}
