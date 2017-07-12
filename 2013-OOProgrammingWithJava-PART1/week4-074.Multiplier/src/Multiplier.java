/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gwg
 */
public class Multiplier {
    private int value;
    
    public Multiplier(int number) {
        this.value = number;
    }
    
    public int multiply (int otherNumber) {
        return this.value * otherNumber;
    }
    
}
