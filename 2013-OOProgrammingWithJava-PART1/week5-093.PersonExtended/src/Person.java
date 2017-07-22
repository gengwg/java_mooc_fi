
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;

        int current_day = Calendar.getInstance().get(Calendar.DATE);
        int current_month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currentDate = new MyDate(current_day, current_month, current_year);

        this.birthday = currentDate;
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int current_day = Calendar.getInstance().get(Calendar.DATE);
        int current_month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currentDate = new MyDate(current_day, current_month, current_year);

        return currentDate.differenceInYears(this.birthday);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return this.birthday.earlier(compared.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
