/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maxiymini;

/**
 *
 * @author MarjorieMoran
 */
public class MaxiyMini {
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

        int maximo = enteros[0]; // Inicia maximo con el primer elemento del arreglo
        int minimo = enteros[0]; // Inicia minimo con el primer elemento del arreglo

        // Recorre el arreglo desde el segundo elemento (índice 1) hasta el final
        for (int i = 1; i < enteros.length; i++) {
            if (enteros[i] > maximo) {
                maximo = enteros[i]; // Actualiza maximo si encuentra un número mayor
            }
            if (enteros[i] < minimo) {
                minimo = enteros[i]; // Actualiza minimo si encuentra un número menor
            }
        }

        // Imprime los resultados
        System.out.println("El mayor número es: " + maximo);
        System.out.println("El menor número es: " + minimo);
    }
}
