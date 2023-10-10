package co.edu.uniquindio.poo;

public class Hexagono  extends FiguraRegular implements IFiguraGeometrica,IFiguraRegular{

    public Hexagono(double lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }
    
     @Override
    public String calcularAngulo() {
        return "cada angulo de un hexamono regular es de 60 grados y en total es de 360 grados";
    }

    @Override
    public double calcularLongitud() {
         return lado / (2.0 * Math.tan(Math.PI / 6));
    }
}
