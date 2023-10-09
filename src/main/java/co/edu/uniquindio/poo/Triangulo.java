package co.edu.uniquindio.poo;

public class Triangulo extends FiguraRegular implements IFiguraGeometrica {
    private double base;
    private double altura;
    private double longitudLado;

    //CONSTRUCTOR
    public Triangulo(double lado, double base, double altura, double longitudLado) {
        super(lado);
        this.base = base;
        this.altura = altura;
        this.longitudLado = longitudLado;
    }
    
    //Métodos a utilizar
    @Override
    public double calcularArea() {
        double areaTriangulo=(base*altura)/2;
        System.out.println("El área del Triángulo es de: "+ areaTriangulo);
        return areaTriangulo;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroTriangulo= lado*3;
        System.out.println("El perímetro del Triángulo es de " + perimetroTriangulo);
        return perimetroTriangulo;
    }
    
    @Override    
    public double calcularSumaAngulosInteriores() {
        double sumaAngulos = (lado - 2) * 180.0;
        System.out.println("La suma de los ángulos interiores del Triángulo es de: " + sumaAngulos);
        return sumaAngulos;
    }

    @Override
    public double calcularLongitudApotema() {
        double longitudApotemaTriangulo=lado / (2 * Math.tan(Math.PI / longitudLado));
        System.out.println("Ña longitud del apotema del Triángulo es de" + longitudApotemaTriangulo);
        return longitudApotemaTriangulo;
    }

        @Override
    public double calcularAlturaTriangulos() {
        double alturaTriangulo = (2 * calcularArea()) / base;
        System.out.println("La altura del Triángulo es de "+ alturaTriangulo);
        return alturaTriangulo;
    }


    //demás métodos no utilizados
    @Override
    public double calcularDiagonalCuadrados() {
        return 0.0;
    }


    @Override
    public double calcularDiametroCirculos() {
        return 0.0;
    }

    //getter y setter
    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getLongitudLado() {
        return longitudLado;
    }


    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
}