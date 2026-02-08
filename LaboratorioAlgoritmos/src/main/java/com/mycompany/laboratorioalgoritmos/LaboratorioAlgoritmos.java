package com.mycompany.laboratorioalgoritmos;
import java.util.*;

public class LaboratorioAlgoritmos {

    public static void main(String[] args) {
        int size = 1000;
        int[][] matriz = generarMatriz(size, size);
        int[] arreglo = aplanarMatriz(matriz);

        // Ejemplo de busqueda
        int target = 500;
        int[] arregloOrdenado = arreglo.clone();
        Arrays.sort(arregloOrdenado); // Necesario para Binaria e Interpolacion

        long inicioBusqueda = System.nanoTime();
        int pos = busquedaBinaria(arregloOrdenado, target);
        long finBusqueda = System.nanoTime();
        
        System.out.println("Resultado de busqueda: " + (pos != -1 ? "Encontrado" : "No encontrado"));
        System.out.println("Tiempo de busqueda: " + (finBusqueda - inicioBusqueda) + " ns");
    }

    public static int[][] generarMatriz(int f, int c) {
        Random rnd = new Random();
        int[][] m = new int[f][c];
        for (int i = 0; i < f; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rnd.nextInt(2001) - 1000; 
        return m;
    }

    public static int[] aplanarMatriz(int[][] m) {
        return Arrays.stream(m).flatMapToInt(Arrays::stream).toArray();
    }

    public static int busquedaBinaria(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}