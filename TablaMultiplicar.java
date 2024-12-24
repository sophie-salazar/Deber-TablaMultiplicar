/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones;

import java.util.Scanner;

// Clase base abstracta
abstract class TablaMultiplicar {
    protected int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public abstract void mostrarTabla();
    public abstract int sumarResultados();
}
