package co.edu.uniquindio.poo;

public class Circulo extends FiguraRegular implements IFiguraGeometrica {

    //CONSTRUCTOR
    public Circulo(double lado) {
        super(lado);
        this.lado = lado;
    }

    //METODOS
    //EN ESTA CLASE, "LADO" ES TOMADO COMO RADIO DEL CÍRCULO. 
    @Override
    public double calcularArea() {
        double areaCirculo=Math.PI * Math.pow(lado, 2);
        System.out.println("El área del circulo es: " +areaCirculo);
        return areaCirculo;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroCirculo=2 * Math.PI * lado;
        System.out.println("El perímetro del circulo es: " + perimetroCirculo);
        return perimetroCirculo;
    }

    @Override
    public double calcularDiametroCirculos() {
        double diametroCirculo= 2 * lado;
        System.out.println("El diámetro del circulo es de: " + diametroCirculo);
        return diametroCirculo;
    }

    //DEMÁS MÉTODOS NO UTILIZADOS
    @Override
    public double calcularSumaAngulosInteriores() {
        return 0.0;
    }

    @Override
    public double calcularLongitudApotema() {
        return 0.0;
    }

    @Override
    public double calcularDiagonalCuadrados() {
        return 0.0;
    }

    @Override
    public double calcularAlturaTriangulos() {
       return 0.0;
    }
}
