/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.ArrayList;
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

        Fibonacci fibonnaci = new Fibonacci();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos de la secuencia.");

        String limit = sc.nextLine();

        fibonnaci.setLimit(Integer.parseInt(limit));

        fibonnaci.generateSequence();
        fibonnaci.pritnSequence();
    }

}
