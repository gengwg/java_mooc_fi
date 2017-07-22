
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate compareDate) {
        if (this.earlier(compareDate)) {
            return compareDate.differenceInYears(this);
        }

        if ((this.month < compareDate.month)
                || (this.day < compareDate.day
                && this.month == compareDate.month)) {
            return this.year - compareDate.year - 1;
        } else {
            return this.year - compareDate.year;
        }

    }

}
