public class CustomerData {
    // Initialized three fields
    private String name;
    private Integer creditLimit;
    private String emailAddress;

    // Getter method
    public String getName() {
        return name; // Returns the value of name
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    // Parameterized constructor
    public CustomerData(String name, Integer creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    // No-argument constructor
    public CustomerData() {
        this("Default Name", 1000, "noemail@example.com");
    }

    public CustomerData(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

}
