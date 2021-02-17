/**
 * The type Employee.
 */
public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private int loginCode;
    private ClockedHours[] clockedHours;
    private dateOfBirth dob;
    private int SIN;

    /**
     * Instantiates a new Employee.
     *
     * @param employeeID the employee id
     * @param firstName  the first name
     * @param lastName   the last name
     * @param loginCode  the login code
     */
    public Employee(int employeeID, String firstName, String lastName, int loginCode) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginCode = loginCode;
    }

    /**
     * Instantiates a new Employee.
     *
     * @param employeeID   the employee id
     * @param firstName    the first name
     * @param lastName     the last name
     * @param loginCode    the login code
     * @param dayOfBirth   the day of birth
     * @param monthOfBirth the month of birth
     * @param yearOfBirth  the year of birth
     */
    public Employee(int employeeID, String firstName, String lastName, int loginCode, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loginCode = loginCode;
        this.dob = new dateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth);
    }

    /**
     * Sets employee id.
     *
     * @param employeeID the employee id
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets login code.
     *
     * @param loginCode the login code
     */
    public void setLoginCode(int loginCode) {
        this.loginCode = loginCode;
    }

    /**
     * Sets clocked hours.
     *
     * @param clockedHours the clocked hours
     */
    public void setClockedHours(ClockedHours[] clockedHours) {
        this.clockedHours = clockedHours;
    }

    /**
     * Sets dob.
     *
     * @param dob the dob
     */
    public void setDob(dateOfBirth dob) {
        this.dob = dob;
    }

    /**
     * Sets sin.
     *
     * @param SIN the sin
     */
    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    /**
     * Gets employee id.
     *
     * @return the employee id
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets login code.
     *
     * @return the login code
     */
    public int getLoginCode() {
        return loginCode;
    }

    /**
     * Get clocked hours clocked hours [ ].
     *
     * @return the clocked hours [ ]
     */
    public ClockedHours[] getClockedHours() {
        return clockedHours;
    }

    /**
     * Gets dob.
     *
     * @return the dob
     */
    public dateOfBirth getDob() {
        return dob;
    }

    /**
     * Gets sin.
     *
     * @return the sin
     */
    public int getSIN() {
        return SIN;
    }
}
