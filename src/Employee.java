public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private int loginCode;
    private ClockedHours[] clockedHours;
    private dateOfBirth dob;
    private int SIN;

    public Employee(int employeeID, String firstName, String lastName, int loginCode) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginCode = loginCode;
    }

    public Employee(int employeeID, String firstName, String lastName, int loginCode, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginCode = loginCode;
        this.dob = new dateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth);
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLoginCode(int loginCode) {
        this.loginCode = loginCode;
    }

    public void setClockedHours(ClockedHours[] clockedHours) {
        this.clockedHours = clockedHours;
    }

    public void setDob(dateOfBirth dob) {
        this.dob = dob;
    }

    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getLoginCode() {
        return loginCode;
    }

    public ClockedHours[] getClockedHours() {
        return clockedHours;
    }

    public dateOfBirth getDob() {
        return dob;
    }

    public int getSIN() {
        return SIN;
    }
}
