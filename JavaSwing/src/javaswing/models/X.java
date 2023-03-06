/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing.models;

/**
 *
 * @author jeffe
 */
public class X {

    private int size;
    private String forma = "";

    public X() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void generateForma() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char element = ' ';
                if (i == j || j + 1 == size - i) {
                    element = 'X';
                }
                forma += element;
            }
            forma += "\n";
        }
    }
}
