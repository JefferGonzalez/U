/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing.models;

/**
 *
 * @author jeffe
 */
public class Trapecio {

    private int horizontalSise;
    private int verticalSize;
    private String forma = "";

    public Trapecio() {

    }

    public int getHorizontalSise() {
        return horizontalSise;
    }

    public void setHorizontalSise(int horizontalSise) {
        this.horizontalSise = horizontalSise;
    }

    public int getVerticalSize() {
        return verticalSize;
    }

    public void setVerticalSize(int verticalSize) {
        this.verticalSize = verticalSize;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void generateForma() {
        String f = "";
        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSise; j++) {
                if (horizontalSise - i > j) {
                    f += "X";
                } else {
                    f += "";
                }
            }
            f += "\n";
        }
        this.setForma(f);
    }

}
