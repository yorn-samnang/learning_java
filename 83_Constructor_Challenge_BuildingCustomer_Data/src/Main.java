public class Main {
    public static void main(String[] args) {
        CustomerData customer = new CustomerData(
                "Jame",
                2,
                "jame@gmail.com"
        );

        CustomerData customer2 = new CustomerData(
                "Nang",
                "nang@gmail.com"
        );

        printCustomerData(customer);
        printCustomerData(customer2);

    }

    public static void printCustomerData(CustomerData customerData) {
        System.out.println("Name: " + customerData.getName());
        System.out.println("CreditLimit: " + customerData.getCreditLimit());
        System.out.println("Email Address: " + customerData.getEmailAddress());

    }
}
