/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma2;

/**
 *
 * @author iliya
 */
public class Sumador {
 private int num1;
    private int num2;

    public Sumador(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


   
    public int sumaValorAbsolut() {
        return Math.abs(num1) + Math.abs(num2);
    }
}
