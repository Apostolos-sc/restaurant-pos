/**
 * The type Clocked hours.
 */
public class ClockedHours {
    private Employee employee;
    private int clockedInMinute;
    private int clockedInHour;
    private int clockedInDay;
    private int clockedInMonth;
    private int clockedInYear;
    private int clockedOutMinute;
    private int clockedOutHour;
    private int clockedOutDay;
    private int clockedOutMonth;
    private int clockedOutYear;

    /**
     * Instantiates a new Clocked hours.
     *
     * @param employee        the employee
     * @param clockedInMinute the clocked in minute
     * @param clockedInHour   the clocked in hour
     * @param clockedInDay    the clocked in day
     * @param clockedInMonth  the clocked in month
     * @param clockedInYear   the clocked in year
     */
    public ClockedHours(Employee employee, int clockedInMinute, int clockedInHour, int clockedInDay, int clockedInMonth, int clockedInYear) {
        this.employee = employee;
        this.clockedInMinute = clockedInMinute;
        this.clockedInHour = clockedInHour;
        this.clockedInDay = clockedInDay;
        this.clockedInMonth = clockedInMonth;
        this.clockedInYear = clockedInYear;
    }

    /**
     * Sets employee.
     *
     * @param employee the employee
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * Sets clocked in minute.
     *
     * @param clockedInMinute the clocked in minute
     */
    public void setClockedInMinute(int clockedInMinute) {
        this.clockedInMinute = clockedInMinute;
    }

    /**
     * Sets clocked in hour.
     *
     * @param clockedInHour the clocked in hour
     */
    public void setClockedInHour(int clockedInHour) {
        this.clockedInHour = clockedInHour;
    }

    /**
     * Sets clocked in day.
     *
     * @param clockedInDay the clocked in day
     */
    public void setClockedInDay(int clockedInDay) {
        this.clockedInDay = clockedInDay;
    }

    /**
     * Sets clocked in month.
     *
     * @param clockedInMonth the clocked in month
     */
    public void setClockedInMonth(int clockedInMonth) {
        this.clockedInMonth = clockedInMonth;
    }

    /**
     * Sets clocked in year.
     *
     * @param clockedInYear the clocked in year
     */
    public void setClockedInYear(int clockedInYear) {
        this.clockedInYear = clockedInYear;
    }

    /**
     * Sets clocked out minute.
     *
     * @param clockedOutMinute the clocked out minute
     */
    public void setClockedOutMinute(int clockedOutMinute) {
        this.clockedOutMinute = clockedOutMinute;
    }

    /**
     * Sets clocked out hour.
     *
     * @param clockedOutHour the clocked out hour
     */
    public void setClockedOutHour(int clockedOutHour) {
        this.clockedOutHour = clockedOutHour;
    }

    /**
     * Sets clocked out day.
     *
     * @param clockedOutDay the clocked out day
     */
    public void setClockedOutDay(int clockedOutDay) {
        this.clockedOutDay = clockedOutDay;
    }

    /**
     * Sets clocked out month.
     *
     * @param clockedOutMonth the clocked out month
     */
    public void setClockedOutMonth(int clockedOutMonth) {
        this.clockedOutMonth = clockedOutMonth;
    }

    /**
     * Sets clocked out year.
     *
     * @param clockedOutYear the clocked out year
     */
    public void setClockedOutYear(int clockedOutYear) {
        this.clockedOutYear = clockedOutYear;
    }

    /**
     * Gets employee.
     *
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Gets clocked in minute.
     *
     * @return the clocked in minute
     */
    public int getClockedInMinute() {
        return clockedInMinute;
    }

    /**
     * Gets clocked in hour.
     *
     * @return the clocked in hour
     */
    public int getClockedInHour() {
        return clockedInHour;
    }

    /**
     * Gets clocked in day.
     *
     * @return the clocked in day
     */
    public int getClockedInDay() {
        return clockedInDay;
    }

    /**
     * Gets clocked in month.
     *
     * @return the clocked in month
     */
    public int getClockedInMonth() {
        return clockedInMonth;
    }

    /**
     * Gets clocked in year.
     *
     * @return the clocked in year
     */
    public int getClockedInYear() {
        return clockedInYear;
    }

    /**
     * Gets clocked out minute.
     *
     * @return the clocked out minute
     */
    public int getClockedOutMinute() {
        return clockedOutMinute;
    }

    /**
     * Gets clocked out hour.
     *
     * @return the clocked out hour
     */
    public int getClockedOutHour() {
        return clockedOutHour;
    }

    /**
     * Gets clocked out day.
     *
     * @return the clocked out day
     */
    public int getClockedOutDay() {
        return clockedOutDay;
    }

    /**
     * Gets clocked out month.
     *
     * @return the clocked out month
     */
    public int getClockedOutMonth() {
        return clockedOutMonth;
    }

    /**
     * Gets clocked out year.
     *
     * @return the clocked out year
     */
    public int getClockedOutYear() {
        return clockedOutYear;
    }
}
