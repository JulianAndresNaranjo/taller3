package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        double lado;
        
        int salida=1;
        while(1==salida){
            System.out.println("1. Circulo\r\n" + 
                "2. Triangulo\r\n"+ 
                "3. Cuadrado\r\n"+ 
                "4. Pentágono\r\n"+ 
                "5. Hexágono\r\n"+ 
                "6. Octágono\r\n"+
                "7. salir") ;
            System.out.print("Seleccione una figura geometrica:");    
            int opcion = scanner.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:

                lado = 3;
                Circulo Circulo = new Circulo(lado);
                System.out.println("El área del círculo es de: "+Circulo.calcularArea());
                System.out.println("El perímetrto del círculo es de: "+Circulo.calcularPerimetro());
                System.out.println("El diámetro del círculo es de: "+Circulo.calcularDiametro());
                System.out.println("");
                break;

                case 2:
                lado = 3;
                Triangulo Triangulo = new Triangulo(lado);
                System.out.println("El área del triángulo es de: "+Triangulo.calcularArea());
                System.out.println("El perímetrto del triángulo es de: "+Triangulo.calcularPerimetro());
                System.out.println("El ángulo del triángulo regular es de "+Triangulo.calcularAngulo());
                System.out.println("La longitud apotema del triángulo es de: "+Triangulo.calcularLongitud());
                System.out.println("La altura del triángulo es: "+Triangulo.calcularAltura());
                System.out.println("");
                break;
                
                case 3:
                lado = 4;
                Cuadrado Cuadrado = new Cuadrado(lado);
                System.out.println("El área del cuadrado es de: "+Cuadrado.calcularArea());
                System.out.println("El perímetrto del cuadrado es de: "+Cuadrado.calcularPerimetro());
                System.out.println("El ángulo del cuadrado es de: "+Cuadrado.calcularAngulo());
                System.out.println("La longitud apotema del cuadrado es de: "+Cuadrado.calcularLongitud());
                System.out.println("La diagonal del cuadrado es de: "+Cuadrado.calcularDiagonal());
                System.out.println("");
                break;

                case 4:
                lado = 5;
                Pentagono Pentagono= new Pentagono(lado);
                System.out.println("El area del pentágono es de: "+Pentagono.calcularArea());
                System.out.println("El perimetrto del pentágono es de: "+Pentagono.calcularPerimetro());
                System.out.println("El angulo del pentágono es de: "+Pentagono.calcularAngulo());
                System.out.println("La longitud apotema del pentágono es de: "+Pentagono.calcularLongitud());
                System.out.println("");
                break;

                case 5:
                lado = 6;
                Hexagono Hexagono= new Hexagono(lado);
                System.out.println("El área del hexágono es de:"+Hexagono.calcularArea());
                System.out.println("El perímetrto del hexágono es de:"+Hexagono.calcularPerimetro());
                System.out.println("El ángulo del hexágono es de:"+Hexagono.calcularAngulo());
                System.out.println("La longitud apotema del hexágono es de:"+Hexagono.calcularLongitud());
                System.out.println("");
                break;

                case 6:
                lado = 8;
                Octagono Octagono= new Octagono(lado);
                System.out.println("El area del octágono es de: "+Octagono.calcularArea());
                System.out.println("El perimetrto del octágono es de: "+Octagono.calcularPerimetro());
                System.out.println("El angulo del octágono es de: "+Octagono.calcularAngulo());
                System.out.println("La longitud apotema del octágono es de: "+Octagono.calcularLongitud());
                System.out.println("");
                break;

                case 7:
                salida=2;
                break;

                default:
                System.out.println("Opción no válida. Seleccione una opción válida.");
                System.out.println("");
        }
    }
    scanner.close();
    }
}
