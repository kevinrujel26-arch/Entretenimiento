# Proyecto Iterator - Catalogo de Películas

## Descripcion

Este proyecto consiste en un catálogo de películas desarrollado en Java aplicando el patrón de diseño Iterator.

El objetivo es poder recorrer las películas sin acceder directamente a la estructura donde se guardan.

## Patrón usado

Se utilizó el patrón **Iterator**, el cual permite recorrer los elementos de una colección


## Estructura utilizada

Se utilizó una **lista enlazada con nodos**.

Cada nodo guarda una película y apunta al siguiente elemento.

Ejemplo:

Joker
↓
Avengers
↓
Matrix
↓
null


## Clases

- Pelicula: contiene los datos de una película.
- NodoPelicula: almacena la película dentro de la lista.
- CatalogoNetflix: agrega y administra las películas.
- PeliculaIterator: permite recorrer la lista.
- Main: ejecuta el programa.

## Resultado

El programa muestra todas las películas del catálogo recorriéndolas mediante el Iterator.

