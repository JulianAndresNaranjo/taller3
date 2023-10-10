package co.edu.uniquindio.poo;

public class Pentagono  extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{
    //constructor
    public Pentagono(double lado) {
        super(lado);

    }

    //metodos
    public double calcularArea() {
        return (5*lado * (lado / 2.0) / Math.tan(Math.toRadians(72) / 2.0)) / 2.0;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }

    public String calcularAngulo() {
        return "72";
    }

    public double calcularLongitud() {
        return (lado / 2.0) / Math.tan(Math.toRadians(72) / 2.0);
    }
}
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
}
