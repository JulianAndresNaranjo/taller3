package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraRegular implements IFiguraGeometrica {
    private double ancho;
    private double largo;
    private double longitudLado;

    //constructor 
    public Cuadrado(double lado, double ancho, double largo, double longitudLado) {
        super(lado);
        this.ancho = ancho;
        this.largo = largo;
        this.longitudLado = longitudLado;
    }
    //Métodos utilizados
    @Override
    public double calcularArea() {
        double areaCuadrado= ancho * largo;
        System.out.println("El área del cuadrado es de: "+ areaCuadrado);
        return areaCuadrado;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroCuadrado = 2*(ancho+largo);
        System.out.println("Elperímetro del cuadrado es de: " + perimetroCuadrado);
        return perimetroCuadrado;
    }

    @Override
    public double calcularSumaAngulosInteriores() {
        double angulosInterioresCuadrado= (lado-2)* 180;
        System.out.println("La suma de los ángulos interiores del cuadradon es de: " + angulosInterioresCuadrado);
        return angulosInterioresCuadrado;
    }

    @Override
    public double calcularLongitudApotema() {
        double longitudApotemaCuadrado=lado / (2 * Math.tan(Math.PI / longitudLado));
        System.out.println("La longitud de Apotema del cuadrado es de: " + longitudApotemaCuadrado);
        return longitudApotemaCuadrado;
    }

    @Override
    public double calcularDiagonalCuadrados() {
        double diagonalCuadrado= lado + Math.sqrt(2);
        System.out.println("La diagonal del cuadrado es de: " + diagonalCuadrado);
        return diagonalCuadrado;
    }

    //DEMÁS MÉTODOS NO UTILIZADOS
    @Override
    public double calcularDiametroCirculos() {
        return 0.0;
    }

    @Override
    public double calcularAlturaTriangulos() {
        return 0.0;
    }
    
    //getter y setter
        public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

     public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

       public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }   
    
}