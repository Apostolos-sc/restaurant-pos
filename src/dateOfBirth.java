/**
 * The type Date of birth.
 */
public class dateOfBirth {
    /**
     * The Day.
     */
    int day;
    /**
     * The Month.
     */
    int month;
    /**
     * The Year.
     */
    int year;

    /**
     * Instantiates a new Date of birth.
     */
    public dateOfBirth() {
    }

    /**
     * Instantiates a new Date of birth.
     *
     * @param day   the day
     * @param month the month
     * @param year  the year
     */
    public dateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Gets day.
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Gets month.
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets day.
     *
     * @param day the day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Sets month.
     *
     * @param month the month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Sets year.
     *
     * @param year the year
     */
    public void setYear(int year) {
        this.year = year;
    }
}
