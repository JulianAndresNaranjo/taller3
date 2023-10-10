package co.edu.uniquindio.poo;

public class Hexagono  extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{
    //constructor
    public Hexagono(double lado) {
        super(lado);
    }

    //metodos
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2.0;
    }

    public double calcularPerimetro() {
        return 6 * lado;
    }

    public String calcularAngulo() {
        return "60";
    }

    public double calcularLongitud() {
         return lado / (2.0 * Math.tan(Math.PI / 6));
    }
}
