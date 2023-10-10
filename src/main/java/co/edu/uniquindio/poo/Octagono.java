package co.edu.uniquindio.poo;

public class Octagono  extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{

    public Octagono(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return 2 * Math.pow(lado, 2) * Math.tan(Math.PI / 8);
    }

    @Override
    public double calcularPerimetro() {
        return 8 * lado;
    }

    @Override
    public String calcularAngulo() {
        return "cada angulo del octagono mide 45 grados asi dado un angulo completo de 360 grados";
    }

    @Override
    public double calcularLongitud() {
        return lado / (2.0 * Math.tan(Math.PI / 8));
    }
}
