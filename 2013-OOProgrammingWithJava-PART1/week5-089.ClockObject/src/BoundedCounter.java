
public class BoundedCounter {

    // copy here the class BoundedCounter from last weeks assignment 78 
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
