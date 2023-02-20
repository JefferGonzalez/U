/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trapecio;

import java.util.Arrays;

/**
 *
 * @author jeffe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("*".repeat(5 - i));
        }
        
        int size = 5;
        
        char[][] matriz = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char element = ' ';
                if (i == j || j + 1 == size - i) element = 'X';                
                matriz[i][j] = element;
            }
        }
        for (char[] en : matriz) {
            System.out.println(Arrays.toString(en));
        }
    }

}
