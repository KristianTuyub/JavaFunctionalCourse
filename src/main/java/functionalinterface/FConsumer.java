package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FConsumer {

    public static void main(String[] args) {
        Customer james_bond = new Customer("James Bond", "007");

        //Using Normal Java Function
        greetCustomer(james_bond);

        // Using Functional Consumer Interface
        greetCustomerConsumer.accept(
                james_bond
        );

        greetCustomerBiConsumer.accept(
                james_bond,
                false
        );
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println(String.format("Hello %s" +
                            ", thanks for registering phone number %s"
                    , customer.customerName
                    , (showPhoneNumber ? customer.customerPhoneNumber: "********")));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println(String.format("Hello %s" +
                            ", thanks for registering phone number %s"
                    ,customer.customerName, customer.customerPhoneNumber));

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
