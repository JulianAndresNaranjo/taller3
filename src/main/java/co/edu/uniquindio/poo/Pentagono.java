package co.edu.uniquindio.poo;

public class Pentagono extends FiguraRegular implements IFiguraGeometrica {
    private double longitudLado;

    //CONSTRUCTOR
    public Pentagono(double lado, double longitudLado) {
        super(lado);
        this.lado = lado;
        this.longitudLado=longitudLado;
    }

    //Métodos utilizados
    @Override
    public double calcularArea() {
        double areaPentagono= (5/4) * Math.pow(longitudLado, 2)* (1 / Math.tan(Math.PI/5));
        System.out.println("El área del Pentágono es de: " + areaPentagono);
        return areaPentagono;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroPentagono = 5*longitudLado;
        System.out.println("El perímetro del Pentágono es de: " +perimetroPentagono);
        return perimetroPentagono;
    }

    @Override
    public double calcularSumaAngulosInteriores() {
        double angulosInterioresPentagono= (lado - 2) * 180;
        System.out.println("La suma de los ángulos interiores delPentágono es de: " + angulosInterioresPentagono);
        return angulosInterioresPentagono;
    }

    @Override
    public double calcularLongitudApotema() {
        double longitudApotemaPentagono=(longitudLado / 2) * (1 / Math.tan(Math.PI/5));
        System.out.println("La longitud del Apotema del Pentágono es de: " + longitudApotemaPentagono);
        return longitudApotemaPentagono;
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