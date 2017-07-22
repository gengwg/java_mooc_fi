
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created 
        // and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);

        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        // Clock advances by one second
        //Thread.sleep(1000);
        this.seconds.next();
        // advance minutes
        if (seconds.getValue() == 0) {
            minutes.next();
        }
        // if minutes become zero, advance hours
        if (seconds.getValue() == 0 && minutes.getValue() == 0) {
            hours.next();
        }

    }

    public String toString() {
        // returns  the string representation
        return (this.hours + ":" + this.minutes + ":" + this.seconds);   
        // the current time 
    }
}
