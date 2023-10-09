package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura geometrica:");
        System.out.println("1. Circulo\r\n" + //
                "2. Triangulo\r\n" + //
                "3. Cuadrado\r\n" + //
                "4. Pentágono\r\n" + //
                "5. Hexágono\r\n" + //
                "6. Octágono");

        int opcion = scanner.nextInt();

        IFiguraGeometrica ifiguraGeometrica = null;

        switch (opcion) {
            case 1:
            System.out.print("---CIRCULO---" + "\n");
                //LADO HACE COMO RADOIO.
                double lado = 3;
                ifiguraGeometrica= new Circulo(lado);
                break;

            case 2:
                System.out.print("---TRIANGULO---" + "\n");
                lado = 3;
                double longitudLado = 5;
                double altura = 5;
                double base= 5;
                ifiguraGeometrica= new Triangulo (lado, base, altura,longitudLado);
                break;

            case 3:
                System.out.print("---CUADRADO---" + "\n");
                lado = 4;
                double ancho=5;
                double largo=5;
                longitudLado = 5;
                ifiguraGeometrica= new Cuadrado(lado, ancho, largo, longitudLado);
                break;
            
            case 4:
                System.out.print("---PENTÁGONO---" + "\n");
                lado = 5;
                longitudLado = 7;
                ifiguraGeometrica= new Pentagono(lado,longitudLado);
                break;

            case 5:
                System.out.print("---HEXÁGONO---" + "\n");
                lado = 6;
                longitudLado = 8;
                ifiguraGeometrica= new Hexagono(lado, longitudLado);
                break;
            
            case 6:
                System.out.print("---OCTÁGONO---" + "\n");
                lado = 8;
                longitudLado = 7;
                ifiguraGeometrica= new Octagono(lado, longitudLado);
                break;


            default:
                System.out.println("Opción no válida. Seleccione una opción válida.");
        }

        if (ifiguraGeometrica != null) {
            ifiguraGeometrica.calcularArea();
            ifiguraGeometrica.calcularPerimetro();
            ifiguraGeometrica.calcularSumaAngulosInteriores();
            ifiguraGeometrica.calcularLongitudApotema();
            ifiguraGeometrica.calcularDiagonalCuadrados();
            ifiguraGeometrica.calcularDiametroCirculos();
            ifiguraGeometrica.calcularAlturaTriangulos();

            System.out.println("Hemos Finalizado");
        }
    scanner.close();
    
    }
}