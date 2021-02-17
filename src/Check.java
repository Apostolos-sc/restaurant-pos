public class Check {
    //-1 indicates the bill doesn't belong to a table
    private static int objectCounter=0;
    private int checkID;
    private int tableNo=-1;
    private Employee server;
    private Order order;
    private boolean closed = false;

    public Check(Employee server) {
        this.server = server;
        checkID = objectCounter;
        objectCounter++;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public void setServer(Employee server) {
        this.server = server;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setCheckID(int checkID) {
        this.checkID = checkID;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public int getTableNo() {
        return tableNo;
    }

    public Employee getServer() {
        return server;
    }

    public Order getOrder() {
        return order;
    }

    public int getCheckID() {
        return checkID;
    }

    public boolean isClosed() {
        return closed;
    }
}
