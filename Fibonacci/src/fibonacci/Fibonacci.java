/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

import java.util.ArrayList;

/**
 *
 * @author jeffe
 */
public class Fibonacci {

    private int limit = 0;
    private ArrayList sequence = new ArrayList<Integer>();

    public Fibonacci() {
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<Integer> sequence) {
        this.sequence = sequence;
    }

    public void generateSequence() {
        int previous = 0;
        int current = 1;
        ArrayList<Integer> fibonnaci = new ArrayList<>();
        for (int i = 0; i < this.getLimit(); i++) {
            fibonnaci.add(previous);
            int nextElement = previous + current;
            previous = current;
            current = nextElement;
            System.out.println("Hola");

        }
        this.setSequence(fibonnaci);
    }
    
    
    public void pritnSequence () { 
        ArrayList sequence = this.getSequence();
        
        for (int i = 0; i < sequence.size(); i++) {
            System.out.println(sequence.get(i));
        }
    }

}
