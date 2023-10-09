package co.edu.uniquindio.poo;

public class Hexagono extends FiguraRegular implements IFiguraGeometrica {
    private double longitudLado;

    //CONSTRUCTOR
    public Hexagono(double lado, double longitudLado) {
        super(lado);
        this.lado = lado;
        this.longitudLado=longitudLado;
    }

    //Métodos utilizados
    @Override
    public double calcularArea() {
        double areaHexagono= (3/2) * Math.pow(longitudLado, 2) * Math.sqrt(3);
        System.out.println("El área del Hexágono es de: " + areaHexagono);
        return areaHexagono;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroHexagono = 6*longitudLado;
        System.out.println("El perímetro del Hexágono es de: " +perimetroHexagono);
        return perimetroHexagono;
    }

    @Override
    public double calcularSumaAngulosInteriores() {
        double angulosInterioresHexagono= (lado - 2) * 180;
        System.out.println("La suma de los ángulos interiores del Hexágono es de: " + angulosInterioresHexagono);
        return angulosInterioresHexagono;
    }

    @Override
    public double calcularLongitudApotema() {
        double longitudApotemaHexagono=(longitudLado / 2) * (1 / Math.tan(Math.PI/5));
        System.out.println("La longitud del Apotema del Hexágono es de: " + longitudApotemaHexagono);
        return longitudApotemaHexagono;
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