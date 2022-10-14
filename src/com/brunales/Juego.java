package com.brunales;

import java.util.Random;
import java.util.Scanner;

public class Juego {

        static final String RESPUESTAS_POSITIVAS = "YSys";
        static final String RESPUESTAS_NEGATIVAS = "Nn";
        public static void ppt() {
            //Posibles opciones
            String[] opciones = {"piedra", "papel", "tijera"};
            final int puntajeObjetivo = 3;
            //Nombre pc
            String nombrePc = "PC";

            //Este bucle se repite hasta que el jugador se canse de jugar
            do {
                //Usario introduce nombre
                System.out.println("Introduce tu nombre de usuario:");
                Scanner sc = new Scanner(System.in);
                String nombreUser = sc.nextLine();

                String ganador = null;

                //Puntaje
                int puntuacionGlobal = 0;
                int puntuacionUser = 0;
                int puntuacionPc = 0;

                //Bucle del juego (se repite hasta que haya ganador)
                do {
                    //Establecemos marcador
                    System.out.println(nombreUser+" "+puntuacionUser +" - " +puntuacionPc+" "+nombrePc);
                    //Mostramos opciones
                    System.out.println("PIEDRA... PAPEL... O TIJERA!");

                    //Recogemos inputs
                    //Input usuario
                    Scanner scGame = new Scanner(System.in);
                    String eleccionUsuario = scGame.nextLine();
                    //Input PC
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(3);
                    String eleccionPc = opciones[randomNumber];
                    System.out.println("PC->" + eleccionPc);

                    //PIEDRA VS ...
                    if (eleccionPc.equals("piedra") && eleccionUsuario.equals("papel")) {
                        puntuacionUser++;
                        //System.out.println("HAS GANADO");
                    }
                    if (eleccionPc.equals("piedra") && eleccionUsuario.equals("tijera")) {
                        puntuacionPc++;
                        //System.out.println("HAS PERDIDO");
                    }
                    if (eleccionPc.equals("piedra") && eleccionUsuario.equals("piedra")) {
                        //System.out.println("HAS EMPATADO");
                        continue;
                    }

                    //PAPEL VS ...
                    if (eleccionPc.equals("papel") && eleccionUsuario.equals("piedra")) {
                        puntuacionPc++;
                        //System.out.println("HAS PERDIDO");
                    }
                    if (eleccionPc.equals("papel") && eleccionUsuario.equals("tijera")) {
                        puntuacionUser++;
                        //System.out.println("HAS GANADO");
                    }
                    if (eleccionPc.equals("papel") && eleccionUsuario.equals("papel")) {
                        //System.out.println("HAS EMPATADO");
                        continue;
                    }

                    //TIJERA VS ...
                    if (eleccionPc.equals("tijera") && eleccionUsuario.equals("piedra")) {
                        puntuacionUser++;
                        //System.out.println("HAS GANADO");
                    }
                    if (eleccionPc.equals("tijera") && eleccionUsuario.equals("papel")) {
                        puntuacionPc++;
                        //System.out.println("HAS PERDIDO");
                    }
                    if (eleccionPc.equals("tijera") && eleccionUsuario.equals("tijera")) {
                        //System.out.println("HAS EMPATADO");
                        continue;
                    }
                    System.out.println(); //salto de linea para que separar lineas

                    puntuacionGlobal = puntuacionPc + puntuacionUser;

                    //Si la partida va empate, y el que gane gana la partida, entra en el if
                    if (puntuacionUser == puntuacionPc && puntajeObjetivo-1 == puntuacionGlobal ) {
                        System.out.println("<<MUERTE SUBITA>>");
                    }

                } while (puntuacionGlobal < puntajeObjetivo);

                //Se asigna ganador. User o pc
                if (puntuacionUser>puntuacionPc) {
                    ganador = nombreUser;
                } else {
                    ganador = nombrePc;
                }

                System.out.println("EL GANADOR ES..."+ganador);
                System.out.println(nombreUser+" "+puntuacionUser +" - " +puntuacionPc+ " " + " "+nombrePc);

            } while(seguirJugando());

        }



        //Esta funcion simplemente devuelve verdadero o falso en funcion del input (si recibe una s/y devuelve verdadero, si no falso)
        public static boolean seguirJugando() {

            Scanner scanner = new Scanner(System.in);
            String input;
            do {
                System.out.println("DESEA JUGAR OTRA PARTIDA? (y/n)");
                input = scanner.nextLine();
            } while (RESPUESTAS_POSITIVAS.indexOf(input.charAt(0)) == -1 && RESPUESTAS_NEGATIVAS.indexOf(input.charAt(0)) == -1);

            if (RESPUESTAS_POSITIVAS.indexOf(input.charAt(0)) != -1) {
                return true;
            }
            return false;
        }

        public static void ahorcado() {
            boolean acierto = false;
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            String[] words = {"arbol", "pantalla"};
            System.out.println("Adivina la palabra");
            String word = words[rand.nextInt(words.length)];
            String aux = nOfSpaces(word.length());

            for (int i = 0; i<word.length(); i++) {
                System.out.print("*");
            }
            do {
                System.out.println();
                System.out.println("INTRODUCE UNA LETRA");
                String letra = sc.nextLine();
                for (int i = 0; i<word.length(); i++) {
                    if (letra.equals(""+word.charAt(i))) {
                        System.out.println(insertIn(aux, letra.charAt(0), aux.indexOf(i)));
                    }
                    else{
                        System.out.print("*");
                    }
                }
            } while (acierto == false);

        }

        public static String insertIn(String s, char c, int i) {
            char[] chars = new char[s.length()];
            for (int j = 0; j<s.length(); j++) {
                chars[j] = s.charAt(j);
            }
            s = "";
            chars[i] = c;
            for (int k = 0; k<chars.length; k++) {
                s += chars[k];
            }
            return s;
        }

        public static String nOfSpaces(int n) {
            String spaces = "";
            for (int i = 0; i<n; i++) {
                spaces+=" ";
            }
            return spaces;
        }

}


