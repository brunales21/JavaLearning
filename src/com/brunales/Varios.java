package com.brunales;

import java.util.Scanner;

public class Varios {


    static int[] c = {9, 10, 12, 5, 7};
    static int[] a = {1, 2, 3, 4, 5};


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
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
}

