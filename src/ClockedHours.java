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

    public ClockedHours(Employee employee, int clockedInMinute, int clockedInHour, int clockedInDay, int clockedInMonth, int clockedInYear) {
        this.employee = employee;
        this.clockedInMinute = clockedInMinute;
        this.clockedInHour = clockedInHour;
        this.clockedInDay = clockedInDay;
        this.clockedInMonth = clockedInMonth;
        this.clockedInYear = clockedInYear;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setClockedInMinute(int clockedInMinute) {
        this.clockedInMinute = clockedInMinute;
    }

    public void setClockedInHour(int clockedInHour) {
        this.clockedInHour = clockedInHour;
    }

    public void setClockedInDay(int clockedInDay) {
        this.clockedInDay = clockedInDay;
    }

    public void setClockedInMonth(int clockedInMonth) {
        this.clockedInMonth = clockedInMonth;
    }

    public void setClockedInYear(int clockedInYear) {
        this.clockedInYear = clockedInYear;
    }

    public void setClockedOutMinute(int clockedOutMinute) {
        this.clockedOutMinute = clockedOutMinute;
    }

    public void setClockedOutHour(int clockedOutHour) {
        this.clockedOutHour = clockedOutHour;
    }

    public void setClockedOutDay(int clockedOutDay) {
        this.clockedOutDay = clockedOutDay;
    }

    public void setClockedOutMonth(int clockedOutMonth) {
        this.clockedOutMonth = clockedOutMonth;
    }

    public void setClockedOutYear(int clockedOutYear) {
        this.clockedOutYear = clockedOutYear;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getClockedInMinute() {
        return clockedInMinute;
    }

    public int getClockedInHour() {
        return clockedInHour;
    }

    public int getClockedInDay() {
        return clockedInDay;
    }

    public int getClockedInMonth() {
        return clockedInMonth;
    }

    public int getClockedInYear() {
        return clockedInYear;
    }

    public int getClockedOutMinute() {
        return clockedOutMinute;
    }

    public int getClockedOutHour() {
        return clockedOutHour;
    }

    public int getClockedOutDay() {
        return clockedOutDay;
    }

    public int getClockedOutMonth() {
        return clockedOutMonth;
    }

    public int getClockedOutYear() {
        return clockedOutYear;
    }
}
