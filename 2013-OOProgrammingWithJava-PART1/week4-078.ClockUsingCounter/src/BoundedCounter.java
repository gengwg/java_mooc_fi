/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gwg
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit + 1;
    }

    public void next() {
        this.value++;
        this.value %= this.upperLimit;
    }

    public String toString() {
        //return "" + String.format("%02d", this.value);
        return String.format("%02d", this.value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value > 0 && value < upperLimit) {
            this.value = value;
        }
    }
}
