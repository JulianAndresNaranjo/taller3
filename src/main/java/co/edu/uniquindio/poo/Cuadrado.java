package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{

    public Cuadrado(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }

    @Override
    public String calcularAngulo() {
        return "cada angulo del cuadrado mide 90 grados asi dado un angulo completo de 360 grados";
    }

    @Override
    public double calcularLongitud() {
        return lado/2.0;
    }
    public double calcularDiagonal(){
        return lado * Math.sqrt(2);
    }
}
