/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing.models;

/**
 *
 * @author jeffe
 */
public class Calculadora {

    private double numberOne = 0;
    private double numberTwo = 0;
    private double result = 0;

    public Calculadora() {
    }
    
    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void add() {
        this.setResult(this.getNumberOne() + this.getNumberTwo());
    }

    public void subtract() {
        this.setResult(this.getNumberOne() - this.getNumberTwo());
    }

    public void multiply() {
        this.setResult(this.getNumberOne() * this.getNumberTwo());
    }

    public void divide() {
        this.setResult(this.getNumberOne() / this.getNumberTwo());
    }

}
