# Analisis de Complejidad Algoritmica y Eficiencia

[cite_start]Este proyecto implementa y compara diversos algoritmos de busqueda y ordenamiento utilizando **Java**, con el objetivo de evaluar su rendimiento y eficiencia bajo diferentes escenarios de carga de datos[cite: 1, 2, 3].

---

## 🛠️ Caracteristicas del Proyecto

* [cite_start]**Lenguaje:** Java [cite: 127]
* **IDE:** Apache NetBeans IDE 24
* [cite_start]**Estructura de datos:** Matriz de 1000x1000 (1,000,000 de elementos) [cite: 8, 11]
* [cite_start]**Rango de valores:** Numeros aleatorios entre -1000 y 1000 [cite: 8, 13]

---

## 🚀 Algoritmos Implementados

### 🔍 1. Metodos de Busqueda
Se evalua el tiempo de ejecucion y la cantidad de comparaciones para encontrar valores especificos:
* [cite_start]**Secuencial:** Complejidad $O(n)$ [cite: 17, 18]
* [cite_start]**Binaria:** Complejidad $O(\log n)$ (Requiere datos ordenados) [cite: 23, 24, 25]
* [cite_start]**Interpolacion:** Complejidad $O(\log \log n)$ [cite: 30, 31, 32]

### 📊 2. Metodos de Ordenamiento
Comparativa de 6 algoritmos aplicados sobre un millon de datos:
* [cite_start]**Cuadraticos ($O(n^2)$):** Bubble Sort e Insertion Sort [cite: 41, 42, 47, 48]
* [cite_start]**Quasi-lineales ($O(n \log n)$):** Merge Sort y Shell Sort [cite: 52, 53, 59, 60]
* [cite_start]**Lineales ($O(n)$):** Counting Sort y Radix Sort [cite: 64, 65, 71, 72]



### 💡 3. Problema Demostrativo (Fibonacci)
[cite_start]Comparativa entre una solucion recursiva simple y una optimizada para evidenciar la importancia de la seleccion algoritmica[cite: 76, 78]:
* [cite_start]**Solucion No Optimizada:** Recursion simple con complejidad exponencial $O(2^n)$ [cite: 85, 86]
* [cite_start]**Solucion Optimizada:** Programacion dinamica con complejidad lineal $O(n)$ [cite: 92, 93]

---

## 📈 Analisis de Resultados

Basado en las pruebas realizadas, se concluye lo siguiente:
* [cite_start]**Eficiencia en Busqueda:** La busqueda binaria logra reducir las comparaciones en un **98.2%** respecto a la secuencial[cite: 28].
* [cite_start]**Velocidad de Ordenamiento:** Los algoritmos lineales como Counting Sort resultan hasta **244 veces mas rapidos** que Bubble Sort para este volumen de datos[cite: 69].
* [cite_start]**Impacto de la Optimizacion:** En el calculo de Fibonacci, la optimizacion permite procesar valores que en la version recursiva serian **impracticables**, reduciendo el tiempo de ejecucion a microsegundos[cite: 83, 97].

---

## 📋 Requisitos del Sistema
* **JDK:** Java Development Kit 17 o superior.
* **IDE:** Apache NetBeans IDE 24.
* [cite_start]**Sistema:** Procesador con arquitectura x86_64[cite: 126].

---
[cite_start]_Proyecto desarrollado para la asignatura de Estructura de Datos - Febrero 2026_ [cite: 6]
