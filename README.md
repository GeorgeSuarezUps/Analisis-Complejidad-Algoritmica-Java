# Analisis de Complejidad Algoritmica y Eficiencia

Este proyecto implementa y compara diversos algoritmos de busqueda y ordenamiento utilizando Java, con el objetivo de evaluar su rendimiento y eficiencia bajo diferentes escenarios de carga de datos.

## Caracteristicas del Proyecto
* [cite_start]**Lenguaje:** Java [cite: 127]
* **IDE:** Apache NetBeans IDE 24
* [cite_start]**Estructura de datos:** Matriz de 1000x1000 (1,000,000 de elementos) [cite: 8, 11]
* [cite_start]**Rango de valores:** Aleatorios entre -1000 y 1000 [cite: 8, 13]

## Algoritmos Implementados

### 1. Busqueda
Se evalua el tiempo de ejecucion y la cantidad de comparaciones para encontrar un valor $x$ y su negativo $-x$:
* [cite_start]**Secuencial:** Complejidad $O(n)$ [cite: 17, 18]
* [cite_start]**Binaria:** Complejidad $O(\log n)$ [cite: 23, 24]
* [cite_start]**Interpolacion:** Complejidad $O(\log \log n)$ [cite: 30, 31]

### 2. Ordenamiento
Comparativa de 6 metodos de ordenacion sobre el millon de datos:
* [cite_start]**Cuadraticos:** Bubble Sort e Insertion Sort [cite: 41, 42, 47]
* [cite_start]**Quasi-lineales:** Merge Sort y Shell Sort [cite: 52, 53, 59]
* [cite_start]**Lineales:** Counting Sort y Radix Sort [cite: 64, 65, 71]

### 3. Problema Demostrativo (Fibonacci)
[cite_start]Se incluye una comparativa entre una solucion recursiva simple ($O(2^n)$) y una solucion optimizada mediante programacion dinamica ($O(n)$) para evidenciar la importancia de la seleccion algoritmica. [cite: 78, 86, 93]

## Analisis de Resultados
Los resultados obtenidos demuestran que:
* [cite_start]La busqueda binaria reduce las comparaciones en mas del 98% respecto a la secuencial. [cite: 28]
* [cite_start]Los algoritmos de ordenamiento lineal (Counting/Radix) son hasta 244 veces mas rapidos que los metodos basicos para este rango de datos. [cite: 69]
* [cite_start]La optimizacion en el calculo de Fibonacci permite pasar de tiempos impracticables a ejecuciones de microsegundos. [cite: 83, 97]

## Requisitos
* Java Development Kit (JDK) 17 o superior.
* Apache NetBeans IDE 24 para la gestion del proyecto.
