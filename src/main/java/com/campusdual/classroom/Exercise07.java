package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        // Realizamos las pruebas
        positionInAList(8);
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(20);
    }

    //TODO ↓
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            list.add(i);
        }

        int index = list.indexOf(num);
        if (index != -1) {
            System.out.println(num + " se encuentra en la posición: " + index);
        } else {
            System.out.println(num + " no se encuventra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
