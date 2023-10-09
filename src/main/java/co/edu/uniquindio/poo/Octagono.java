package co.edu.uniquindio.poo;

public class Octagono extends FiguraRegular implements IFiguraGeometrica {
    private double longitudLado;

    //CONSTRUCTOR
    public Octagono(double lado, double longitudLado) {
        super(lado);
        this.lado = lado;
        this.longitudLado=longitudLado;
    }

    //Métodos utilizados
    @Override
    public double calcularArea() {
        double areaOctagono= 2 * Math.pow(longitudLado, 2) * (1 + Math.sqrt(2));
        System.out.println("El área del Octágono es de: " + areaOctagono);
        return areaOctagono;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroOctagono = 5*longitudLado;
        System.out.println("El perímetro del Octágono es de: " +perimetroOctagono);
        return perimetroOctagono;
    }

    @Override
    public double calcularSumaAngulosInteriores() {
        double angulosInterioresOctagono= (lado - 2) * 180;
        System.out.println("La suma de los ángulos interiores del Octágono es de: " + angulosInterioresOctagono);
        return angulosInterioresOctagono;
    }

    @Override
    public double calcularLongitudApotema() {
        double longitudApotemaOctagono=(longitudLado / 2) * (1 + Math.sqrt(2));
        System.out.println("La longitud del Apotema del Octágono es de: " + longitudApotemaOctagono);
        return longitudApotemaOctagono;
    }

    //DEMÁS MÉTODOS NO UTILIZADOS
    @Override
    public double calcularDiagonalCuadrados() {
        return 0.0;
    }

    @Override
    public double calcularDiametroCirculos() {
        return 0.0;
    }

    @Override
    public double calcularAlturaTriangulos() {
        return 0.0;
    }

    //GETTERS Y SETTERS
    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

}