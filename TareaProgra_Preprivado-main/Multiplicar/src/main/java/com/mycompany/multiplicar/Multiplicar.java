/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicar;

/**
 *
 * @author Gredys Morales
 */
import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
        int[] enteros = {788, 758, 729, 756, 599, 358, 134, 946, 942, 913,
                        36, 400, 674, 140, 766, 992, 318, 646, 745, 415,
                        936, 16, 56, 327, 907, 362, 110, 672, 19, 390,
                        671, 392, 299, 865, 709, 159, 357, 848, 462, 132,
                        728, 378, 539, 514, 875, 426, 938, 456, 82, 361,
                        230, 791, 907, 458, 695, 390, 190, 113, 970, 456,
                        995, 832, 776, 411, 769, 834, 961, 831, 719, 211,
                        225, 5, 154, 369, 851, 427, 466, 353, 263, 556,
                        37, 953, 556, 645, 361, 619, 916, 198, 674, 657,
                        401, 256, 285, 811, 662, 808, 929, 852, 692, 434};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número por el cual multiplicar cada elemento del arreglo: ");
        int multiplicador = scanner.nextInt();

        System.out.println("Arreglo original:");
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + " ");
        }
        
        System.out.println("\n\nArreglo después de multiplicar cada elemento por " + multiplicador + ":");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] *= multiplicador; // Multiplica cada elemento del arreglo por el valor ingresado
            System.out.print(enteros[i] + " ");
        }
    }
}