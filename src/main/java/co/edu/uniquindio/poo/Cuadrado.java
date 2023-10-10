package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{
    //constructor
    public Cuadrado(double lado) {
        super(lado);
    }
    
    //metodos
    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro() {
        return lado*4;
    }

    public String calcularAngulo() {
        return "90";
    }

    public double calcularLongitud() {
        return lado/2.0;
    }

    public double calcularDiagonal(){
        return lado * Math.sqrt(2);
    }
}
