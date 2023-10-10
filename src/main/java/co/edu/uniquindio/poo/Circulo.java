package co.edu.uniquindio.poo;

public class Circulo extends FiguraRegular implements IFiguraGeometrica {

    public Circulo(double lado) {
        super(lado);
    }

    public double calcularArea() {
        return Math.PI * Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * lado;
    }

    public double calcularDiametro(){
        return 2 * lado;
        
    }
}
