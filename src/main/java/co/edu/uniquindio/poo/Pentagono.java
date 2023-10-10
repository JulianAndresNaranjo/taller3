package co.edu.uniquindio.poo;

public class Pentagono  extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{

    private double apotema;

    public Pentagono(double lado) {
        super(lado);
        this.apotema=apotema;
    }

    @Override
    public double calcularArea() {
        return (5*lado * apotema) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }

    @Override
    public String calcularAngulo() {
        return "cada angulo del pentagono mide 72 grados asi dado un angulo completo de 360 grados";
    }

    @Override
    public double calcularLongitud() {
        return apotema=(lado / 2.0) / Math.tan(Math.toRadians(72) / 2.0);
        
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
}
