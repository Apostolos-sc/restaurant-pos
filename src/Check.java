/**
 * The type Check.
 */
public class Check {
    //-1 indicates the bill doesn't belong to a table
    private static int objectCounter=0;
    private int checkID;
    private int tableNo=-1;
    private Employee server;
    private Order order;
    private boolean closed = false;

    /**
     * Instantiates a new Check.
     *
     * @param server the server
     */
    public Check(Employee server) {
        this.server = server;
        checkID = objectCounter;
        objectCounter++;
    }

    /**
     * Sets table no.
     *
     * @param tableNo the table no
     */
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    /**
     * Sets server.
     *
     * @param server the server
     */
    public void setServer(Employee server) {
        this.server = server;
    }

    /**
     * Sets order.
     *
     * @param order the order
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * Sets check id.
     *
     * @param checkID the check id
     */
    public void setCheckID(int checkID) {
        this.checkID = checkID;
    }

    /**
     * Sets closed.
     *
     * @param closed the closed
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    /**
     * Gets table no.
     *
     * @return the table no
     */
    public int getTableNo() {
        return tableNo;
    }

    /**
     * Gets server.
     *
     * @return the server
     */
    public Employee getServer() {
        return server;
    }

    /**
     * Gets order.
     *
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Gets check id.
     *
     * @return the check id
     */
    public int getCheckID() {
        return checkID;
    }

    /**
     * Is closed boolean.
     *
     * @return the boolean
     */
    public boolean isClosed() {
        return closed;
    }
}
