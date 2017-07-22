/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gwg
 */
public class Counter {

    private int value;
    private boolean check = false;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.value = startingValue;
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease() {
        if (!this.check) {
            this.value--;
        } else if (this.value > 0) {
            this.value--;
        }
    }

    public void decrease(int decreaseAmount) {

        if (!this.check) {
            if (decreaseAmount >= 0) {
                this.value -= decreaseAmount;
            }
        } else {
            if (this.value - decreaseAmount >= 0) {
                this.value -= decreaseAmount;
            } else {
                this.value = 0;
            }

        }

    }

}
