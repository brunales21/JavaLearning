package com.brunales;

import java.util.Scanner;

public class Varios {

    static Scanner sc = new Scanner(System.in);

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

    //Input: array de integers
    //Output: mayor incremento de paso 1
    public static int getHighestIncrease(int[] numbers) {
        int subtract = 0;
        int highestSubtract = 0;
        //Recorro el input (array de integers)
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] > numbers[i]) {
                //Recogo la resta entre la siguiente iteracion y la actual (y le sumo la anterior)
                subtract += numbers[i + 1] - numbers[i];
                //Si la resta es mayor a la "maxima resta"
                if (subtract > highestSubtract) {
                    //actualizo la nueva "mayor resta"
                    highestSubtract = subtract;
                }
            } else {
                //asigno 0 a resta si la iteracion es mayor a la siguiente ({3, 1}) para "pasar página"
                //ya que reutilizo esta variable en siguientes iteraciones
                subtract = 0;
            }

        }
        return highestSubtract;
    }

    //Input: array de numeros
    //Output: lo imprime
    public static void showIntArray(int[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static int getAscii(char x) {
        return (int) x;
    }


    //Input: texto
    //Output: siglas del texto
    public static String getSiglas() {
        //Leemos input y lo guardamos en text
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        //Envio el input a un array de strings (cada string ahora tiene un indice)
        String[] textos = text.split(" ");
        String sigla = "";

        for (int i = 0; i < textos.length; i++) {
            //Omitimos la palabra "de"
            if (textos[i].equals("de")) continue;
            //metemos la inicial de la palabra en un string
            sigla += String.valueOf(textos[i].charAt(0));
            //si la palabra es plural, se duplica su letra inicial
            if (textos[i].charAt(textos[i].length() - 1) == 's') sigla += String.valueOf(textos[i].charAt(0));
        }
        return sigla.toUpperCase();
    }

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
}
