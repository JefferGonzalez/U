/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author jeffe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        
        Calculadora calculadora = new Calculadora();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                           Ingresa la operación a realizar:
                           1: Sumar
                           2: Restar
                           3: Multiplicar
                           4: Dividir
                           """);
        String operation = sc.nextLine();
        
        System.out.println("Ingresa un número");
        String firstNumber = sc.nextLine();
        System.out.println("Ingresa otro número");
        String secondNumber = sc.nextLine();
        
        calculadora.setNumberOne(Integer.parseInt(firstNumber));
        calculadora.setNumberTwo(Integer.parseInt(secondNumber));
        switch (operation) {
            case "1" ->
                calculadora.add();
            case "2" ->
                calculadora.subtract();
            case "3" ->
                calculadora.multiply();
            case "4" ->
                calculadora.divide();
        }
        
        System.out.println("""
                         El resultado es:

                         """.concat(String.valueOf(calculadora.getResult())));
    }
    
}
