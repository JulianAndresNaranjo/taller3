package co.edu.uniquindio.poo;

public class Octagono  extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{
    //constructor
    public Octagono(double lado) {
        super(lado);
    }

    //metodos
    public double calcularArea() {
        return 2 * Math.pow(lado, 2) * Math.tan(Math.PI / 8);
    }

    public double calcularPerimetro() {
        return 8 * lado;
    }

    public String calcularAngulo() {
        return "1080";
    }

    public double calcularLongitud() {
        return lado / (2.0 * Math.tan(Math.PI / 8));
    }
}
