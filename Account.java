public class Account {
    private String nameOfCustomer;
    private float balanceOfCustomer;
    private String passwordOfCustomer;
    private String IDOfCustomer;

    public Account(String name, float balance, String password,String id) {
        this.nameOfCustomer = name;
        this.balanceOfCustomer = balance;
        this.passwordOfCustomer = password;
        this.IDOfCustomer = id;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public float getBalanceOfCustomer() {
        return balanceOfCustomer;
    }

    void setBalanceOfCustomer(float balanceOfCustomer) {
        this.balanceOfCustomer = balanceOfCustomer;
    }

    public String getPasswordOfCustomer() {
        return passwordOfCustomer;
    }

    void setPasswordOfCustomer(String passwordOfCustomer) {
        this.passwordOfCustomer = passwordOfCustomer;
    }

    public String getIDOfCustomer() {
        return IDOfCustomer;
    }

    void setIDOfCustomer(String IDOfCustomer) {
        this.IDOfCustomer = IDOfCustomer;
    }
}
