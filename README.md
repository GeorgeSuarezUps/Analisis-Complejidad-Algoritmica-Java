# Analisis de Complejidad Algoritmica y Eficiencia

Este proyecto implementa y compara diversos algoritmos de busqueda y ordenamiento utilizando **Java**, con el objetivo de evaluar su rendimiento y eficiencia bajo diferentes escenarios de carga de datos.

---

## 🛠️ Caracteristicas del Proyecto

* **Lenguaje:** Java 
* **IDE:** Apache NetBeans IDE 24
* **Estructura de datos:** Matriz de 1000x1000 (1,000,000 de elementos)
* **Rango de valores:** Numeros aleatorios entre -1000 y 1000

---

## 🚀 Algoritmos Implementados

### 🔍 1. Metodos de Busqueda
Se evalua el tiempo de ejecucion y la cantidad de comparaciones para encontrar valores especificos:
* **Secuencial:** Complejidad $O(n)$
* **Binaria:** Complejidad $O(\log n)$ (Requiere datos ordenados) 
* **Interpolacion:** Complejidad $O(\log \log n)$ 

### 📊 2. Metodos de Ordenamiento
Comparativa de 6 algoritmos aplicados sobre un millon de datos:
* **Cuadraticos ($O(n^2)$):** Bubble Sort e Insertion Sort 
* **Quasi-lineales ($O(n \log n)$):** Merge Sort y Shell Sort 
* **Lineales ($O(n)$):** Counting Sort y Radix Sort 


### 💡 3. Problema Demostrativo (Fibonacci)
Comparativa entre una solucion recursiva simple y una optimizada para evidenciar la importancia de la seleccion algoritmica:
* **Solucion No Optimizada:** Recursion simple con complejidad exponencial $O(2^n)$ 
* **Solucion Optimizada:** Programacion dinamica con complejidad lineal $O(n)$ 

---

## 📈 Analisis de Resultados

Basado en las pruebas realizadas, se concluye lo siguiente:
* **Eficiencia en Busqueda:** La busqueda binaria logra reducir las comparaciones en un **98.2%** respecto a la secuencial.
* **Velocidad de Ordenamiento:** Los algoritmos lineales como Counting Sort resultan hasta **244 veces mas rapidos** que Bubble Sort para este volumen de datos.
* **Impacto de la Optimizacion:** En el calculo de Fibonacci, la optimizacion permite procesar valores que en la version recursiva serian **impracticables**, reduciendo el tiempo de ejecucion a microsegundos.

---

## 📋 Requisitos del Sistema
* **JDK:** Java Development Kit 17 o superior.
* **IDE:** Apache NetBeans IDE 24.
* **Sistema:** Procesador con arquitectura x86_64.

---
Proyecto desarrollado para la asignatura de Estructura de Datos - Febrero 2026_ 
