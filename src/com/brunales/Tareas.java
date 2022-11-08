package com.brunales;

import java.util.Scanner;

public class Tareas {

    static Scanner sc = new Scanner(System.in);

    public static void saludo() {
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }

    public static void getChar() {
        char caracter = sc.nextLine().charAt(0);
        System.out.println(caracter);
    }

    public static void sumar() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    public static void getMedia() {
        System.out.print("Introduce el numero de elementos sobre los cuales quieras calcular la media: ");
        int x = sc.nextInt();

        double a = 0;
        for (int i = 0; i < x; i++) {
            System.out.print("Elemento " + i + " :");
            a += sc.nextInt();
        }
        double m = a / x;
        System.out.println("Media = " + m);
    }

    public static void conversionDeTemp() {
        System.out.print("Introduce la temperatura en CÂº: ");
        double c = sc.nextInt();
        double f = (c * 1.8) + 32;
        double k = c + 273.15;
        double r = 4 * c / 5;
        System.out.println("Farenheit = " + f);
        System.out.println("Kelvin = " + k);
        System.out.println("Reaumur = " + r);
    }

    //Algoritmo: calcular la distancia entre dos puntos
    //Input: coordenadas de dos puntos
    //Salida: distancia
    public static void distAtoB() {

        System.out.println("Introduce las coordenadas del punto 1 = ");
        float x1 = sc.nextInt();
        float y1 = sc.nextInt();
        System.out.println("Introduce las coordenadas del punto 2 = ");
        float x2 = sc.nextInt();
        float y2 = sc.nextInt();

        float x = x2 - x1;
        float y = y2 - y1;
        float distance = (float) Math.sqrt(x * x + y * y);

        System.out.println("Distance = " + distance);
    }

    public static void interesSemestral() {
        System.out.print("Dinero depositado en banco: ");
        double dineroDepositado = sc.nextInt();

        double beneficioAnual = dineroDepositado * (2.75/100);
        double beneficioSemestral = beneficioAnual/2;
        double miBeneficio = beneficioSemestral * 0.82;
        double miDinero = miBeneficio + dineroDepositado;
        System.out.println("Dinero que te corresponde: "+miDinero+"€");
    }

    public static void areaYperimetroRectangulo() {
        System.out.println("Introduce el lado1: ");
        double a = sc.nextInt();
        System.out.println("Introduce el lado2: ");
        double b = sc.nextInt();
        System.out.println("Area = "+ (a*b) + " Perimetro = "+((a*2)+(b*2)));
    }

    //Input: 3 enteros. a, b y c.
    //si se quiere solo resultados ENTEROS hay que añadir la siguiente condicion al if
    // && sqrt - (int) sqrt == 0
    //Output: dos enteros. x1 y x2
    public static void ecuacionSegundoGrado() {
        System.out.print("Introduce a = ");
        double a = sc.nextInt();
        System.out.print("Introduce b = ");
        double b = sc.nextInt();
        System.out.print("Introduce c = ");
        double c = sc.nextInt();

        double sqrt = Math.sqrt((b * b) - (4 * a * c));
        double x1 = (-b+ sqrt)/(2*a);
        double x2 = (-b- sqrt)/(2*a);

        if (sqrt>0) {
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        } else {
            System.out.println("no existe");
        }
    }

    //Algoritmo: media de 4 numeros enteros
    //Input: numeros
    //Output: media de dichos numeros
    public static void media() {
        int cantidadElementos = 4;
        int a = 0;
        for (int i = 0; i<cantidadElementos; i++) {
            System.out.println("Introduzca el elemento "+(i+1));
            a += sc.nextInt();
        }
        System.out.println("Media = "+a/cantidadElementos);

    }

    //Input: lado del triangulo
    //Output: area y perimetro
    public static void areaYperimetroTriangulo() {
        System.out.println("Introduce el lado del triangulo: ");
        double lado = sc.nextInt();
        double altura = Math.sqrt(lado*lado-(lado/2)*(lado/2));
        double area = (lado*altura)/2;
        double per = 3*lado;
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + per);
    }
    //Input: radio de circunferencia
    //Output: perimetro
    public static void perimetroCircunferencia() {
        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = sc.nextInt();
        double perimetro = 2*Math.PI*radio;
        System.out.println("Area = " + perimetro);
    }

    //Input: radio de circunferencia
    //Output: area
    public static void areaCircunferencia() {
        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = sc.nextInt();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Area = " + area);
    }

    public static void problemaTren() {
        System.out.print("Introduzca los km que va a recorrer: ");
        double kmARecorrer = sc.nextDouble();
        System.out.print("Introduzca los dias de instancia: ");
        int diasEstancia = sc.nextInt();
        final double precioPorKm = 2.5;
        double descuento = 0;

        if (kmARecorrer > 800 && diasEstancia > 7) {
            descuento = 0.3;
        }
        double pago = kmARecorrer*precioPorKm;
        double descuentoAplicado = pago*(1-descuento);
        System.out.println("El viaje cuesta "+descuentoAplicado+"€");
    }



    public static void dias() {
        //entrega
        enum DiasSemana {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};

        DiasSemana martes = DiasSemana.MARTES;
        System.out.println(martes);
        System.out.println(DiasSemana.DOMINGO);
    }




}


