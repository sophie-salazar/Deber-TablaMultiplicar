/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones;

class TablaAscendente extends TablaMultiplicar {
    public TablaAscendente(int numero) {
        super(numero);
    }

    @Override
    public void mostrarTabla() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    @Override
    public int sumarResultados() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += (numero * i);
        }
        return suma;
    }
}
