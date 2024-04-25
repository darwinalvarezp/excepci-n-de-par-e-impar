package com.mycompany.es_o_no_par;

import java.util.Random;
import java.util.Scanner;

public class Es_o_no_par {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Inicializamos el contador de vidas
        int vidas = 3;

        while (vidas > 0) {
            System.out.println("¿Cuántas rondas quieres jugar?");
            int numRondas = scanner.nextInt();
            int contador = 0;
            int opcion;

            while (contador < numRondas) {
                int numeroAleatorio = rand.nextInt(7) + 1;
                contador++;

                System.out.println("Ronda " + contador + " - Número: " + numeroAleatorio);

                if (numeroAleatorio % 2 == 0) {
                    System.out.println("¡Número par! Pierdes una vida. Te quedan " + (--vidas) + " vidas.");
                    if (vidas == 0) {
                        System.out.println("¡Perdiste todas tus vidas!");
                        break;
                    }
                } else {
                    System.out.println("Sigue jugando. ¿Quieres continuar? (Ingresa 1 para sí, 0 para no)");
                    opcion = scanner.nextInt();
                    if (opcion == 0) {
                        break;
                    }
                }
            }

            if (contador == numRondas && vidas > 0) {
                System.out.println("¡Felicidades! Has alcanzado el final de las " + numRondas + " rondas sin perder.");
            }

            // Si quedan vidas y el jugador decide continuar, se restablece el contador de vidas
            if (vidas > 0) {
                vidas = 3;
                System.out.println("¿Quieres jugar de nuevo? (Ingresa 1 para sí, 0 para no)");
                opcion = scanner.nextInt();
                if (opcion == 0) {
                    break;
                }
            }
        }
        scanner.close();
    }
}
