package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura geometrica:");
        System.out.println("1. Circulo\r\n" + 
                "2. Triangulo\r\n" + 
                "3. Cuadrado\r\n" + 
                "4. Pentágono\r\n" + 
                "5. Hexágono\r\n" + 
                "6. Octágono");
        System.out.println("");

        int opcion = scanner.nextInt();
        double lado;

        System.out.println("");

        switch (opcion) {
            case 1:
                lado = 3;

                Circulo Circulo = new Circulo(lado);
                System.out.println("el area del circulo es de:"+Circulo.calcularArea());
                System.out.println("el perimetrto del circulo es de:"+Circulo.calcularPerimetro());
                System.out.println("el diametro del circulo es de:"+Circulo.calcularDiametro());
                System.out.println("");
                break;

             case 2:
                lado = 3;
                Triangulo Triangulo = new Triangulo(lado);
                System.out.println("el area del triangulo es de:"+Triangulo.calcularArea());
                System.out.println("el perimetrto del triangulo es de:"+Triangulo.calcularPerimetro());
                System.out.println("el angulo del triangulo regular es de "+Triangulo.calcularAngulo());
                System.out.println("la longitud apotema del  triangulo es de:"+Triangulo.calcularLongitud());
                System.out.println("la altura del triangulo es:"+Triangulo.calcularAltura());
                System.out.println("");
                break;

            case 3:
                lado = 4;
                Cuadrado Cuadrado = new Cuadrado(lado);
                System.out.println("el area del cuadrado es de:"+Cuadrado.calcularArea());
                System.out.println("el perimetrto del cuadrado es de:"+Cuadrado.calcularPerimetro());
                System.out.println("el angulo del cuadrado es de:"+Cuadrado.calcularAngulo());
                System.out.println("la longitud apotema del cuadrado es de:"+Cuadrado.calcularLongitud());
                System.out.println("la diagonal del cuadrado es de:"+Cuadrado.calcularDiagonal());
                System.out.println("");
                break;

            case 4:
                lado = 5;
                Pentagono Pentagono= new Pentagono(lado);
                System.out.println("el area del pentagono es de:"+Pentagono.calcularArea());
                System.out.println("el perimetrto del pentagono es de:"+Pentagono.calcularPerimetro());
                System.out.println("el angulo del pentagono es de:"+Pentagono.calcularAngulo());
                System.out.println("la longitud apotema del pentagono es de:"+Pentagono.calcularLongitud());
                System.out.println("");
                break;

            case 5:
                lado = 6;
                Hexagono Hexagono= new Hexagono(lado);
                System.out.println("el area del hexagono es de:"+Hexagono.calcularArea());
                System.out.println("el perimetrto del hexagono es de:"+Hexagono.calcularPerimetro());
                System.out.println("el angulo del hexagono es de:"+Hexagono.calcularAngulo());
                System.out.println("la longitud apotema del hexagono es de:"+Hexagono.calcularLongitud());
                System.out.println("");
                break;
            
            case 6:
                lado = 8;
                Octagono Octagono= new Octagono(lado);
                System.out.println("el area del octagono es de:"+Octagono.calcularArea());
                System.out.println("el perimetrto del octagono es de:"+Octagono.calcularPerimetro());
                System.out.println("el angulo del octagono es de:"+Octagono.calcularAngulo());
                System.out.println("la longitud apotema del octagono es de:"+Octagono.calcularLongitud());
                System.out.println("");
                break;


            default:
                System.out.println("Opción no válida. Seleccione una opción válida.");
                System.out.println("");
        }
    scanner.close();
    }
}
