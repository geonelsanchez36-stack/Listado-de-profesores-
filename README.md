# Listado de Profesores

## Descripción

Este proyecto fue desarrollado como parte de la asignatura Estructura de Datos .

Su objetivo es implementar una Lista Simplemente Enlazada para gestionar información de profesores pertenecientes al Departamento de Informática.

De cada profesor se almacena:

- Nombre
- Edad
- Categoría docente

Las categorías docentes manejadas por el sistema son:

- Instructor
- Asistente
- Auxiliar
- Titular

Además de las operaciones básicas de una lista enlazada, se implementaron métodos específicos para resolver los requerimientos planteados en la clase práctica. 

---

# Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

## Clase Profesores

Representa la información de un profesor.

### Atributos

- nombre
- edad
- categoriaDocente

### Métodos

#### Getters y Setters

Permiten acceder y modificar los atributos del objeto.

#### toString()

Devuelve una representación en texto de un profesor para facilitar su visualización por consola.

Ejemplo:

```java
Profesores{
nombre='Juan',
edad=35,
categoriaDocente='Asistente'
}
```

---

## Clase Nodo

Representa cada nodo de la Lista Simplemente Enlazada.

### Atributos

- profesor: almacena un objeto de tipo Profesores.
- next: referencia al siguiente nodo de la lista.

### Funcionalidad

Permite enlazar profesores entre sí formando la estructura dinámica de la lista.

---

## Interfaz ListInterface

Define las operaciones fundamentales de la lista.

### Métodos declarados

```java
void add(Profesores valor);
boolean isEmpty();
Profesores get(int index);
Profesores remove(int index);
```

---

## Clase LinkedList

Implementa la estructura de Lista Simplemente Enlazada.

### Atributos

```java
private Nodo cabeza;
private int size;
```

- cabeza: primer nodo de la lista.
- size: cantidad de elementos almacenados.

---

# Métodos Básicos

## add(Profesores valor)

Inserta un profesor al final de la lista.

### Funcionamiento

- Si la lista está vacía, el nuevo nodo se convierte en la cabeza.
- En caso contrario, se recorre la lista hasta el último nodo y se enlaza el nuevo elemento.

---

## isEmpty()

Comprueba si la lista está vacía.

### Retorna

```java
true
```

si la lista no contiene elementos.

```java
false
```

en caso contrario.

---

## get(int index)

Obtiene el profesor almacenado en una posición determinada.

### Parámetros

```java
index
```

Posición del elemento a recuperar.

### Retorna

Un objeto de tipo:

```java
Profesores
```

---

## remove(int index)

Elimina un elemento de la lista según su posición.

### Retorna

El profesor eliminado.

---

# Métodos Solicitados en el Ejercicio

## a) ProxCambio()

### Objetivo

Obtener los nombres de los profesores que están próximos a cambiar de categoría docente para Asistente.

Según el enunciado, se consideran candidatos aquellos profesores que:

- Sean Instructores.
- Tengan 26 años o más. 【1-1ce9e4】

### Funcionamiento

1. Se recorre la lista para contar cuántos profesores cumplen la condición.
2. Se crea un arreglo con el tamaño exacto necesario.
3. Se recorre nuevamente la lista para almacenar los nombres encontrados.
4. Se devuelve el arreglo resultante.

### Retorna

```java
String[]
```

con los nombres de los profesores aptos para el cambio de categoría.

---

## b) MostrarLista()

### Objetivo

Mostrar la información de los profesores ordenados por edad de mayor a menor. 【1-1ce9e4】

### Funcionamiento

Para lograr el ordenamiento se implementó el algoritmo:

```java
Merge Sort
```

adaptado para listas simplemente enlazadas.

### Pasos

1. Dividir la lista en dos mitades.
2. Ordenar recursivamente cada mitad.
3. Combinar ambas listas ordenadas.
4. Imprimir la lista resultante.

### Métodos auxiliares

#### mergeSort()

Realiza la división recursiva de la lista.

#### obtenerMedio()

Encuentra el nodo central utilizando dos punteros:

- lento
- rápido

#### merge()

Fusiona dos listas ya ordenadas comparando las edades de los profesores.

### Resultado

Los profesores se muestran ordenados de mayor a menor edad.

Ejemplo:

```text
Profesor 1 - 55 años
Profesor 2 - 50 años
Profesor 3 - 42 años
Profesor 4 - 35 años
```

---

## c) CantProfesores()

### Objetivo

Determinar la cantidad de profesores existentes en cada categoría docente. 【1-1ce9e4】

### Funcionamiento

Se recorre la lista una sola vez contabilizando:

- Instructores
- Asistentes
- Auxiliares
- Titulares

### Retorna

Un String con el resumen de la información.

Ejemplo:

```text
Profesores por categoria docente:

Instructor: 3
Asistente: 2
Auxiliar: 5
Titular: 1
```

---

# Algoritmos Utilizados

## Merge Sort

Se utilizó para ordenar la lista por edad.

### Ventajas

- Complejidad O(n log n).
- Muy eficiente para listas enlazadas.
- No requiere acceso directo por índice.

---

# Casos de Prueba

Se recomienda probar el sistema con profesores de diferentes:

- Nombres
- Edades
- Categorías docentes

Para verificar:

- Detección correcta de profesores próximos al cambio de categoría.
- Ordenamiento correcto por edad.
- Conteo correcto por categoría docente.

---
Todo estos casos de pruebas son implementados en la clase Main

# Autor

Geonel Sánchez

Proyecto académico desarrollado para la asignatura Estructura de Datos .
