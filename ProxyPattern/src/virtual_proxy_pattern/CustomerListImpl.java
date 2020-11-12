package virtual_proxy_pattern;

import java.util.ArrayList;
import java.util.List;

// RealSubject
public class CustomerListImpl implements CustomerList{
    @Override
    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Franz Schweiger", "Kohlstraße 20, München", true));
        customerList.add(new Customer("Alice Schweiger", "Wohl 20, München", true));
        customerList.add(new Customer("Tim Schweiger", "Grünwalder 30, München", true));
        System.out.println("Datenbankabfrage wurde durchgeführt!");
        return customerList;
    }
}
