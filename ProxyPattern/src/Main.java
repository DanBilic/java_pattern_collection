import schutz_proxy_pattern.DownloadProduct;
import schutz_proxy_pattern.DownloadProductProxy;
import virtual_proxy_pattern.Company;
import virtual_proxy_pattern.Customer;
import virtual_proxy_pattern.CustomerList;
import virtual_proxy_pattern.CustomerListProxyImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        DownloadProduct javaEbook = new DownloadProduct("Java E-book");
        Customer hendrik = new Customer("Hendrik Pruin");


        javaEbook.download(hendrik);
        javaEbook.download(hendrik);
        javaEbook.download(hendrik);
        javaEbook.download(hendrik);
        javaEbook.download(hendrik);


        DownloadProductProxy patternEbook = new DownloadProductProxy("Design Patterns E-Book");
        patternEbook.download(hendrik);
        patternEbook.download(hendrik);
        patternEbook.download(hendrik);
        patternEbook.download(hendrik);
        */



        // ------------- Virtual Proxy Pattern ------------------
        System.out.println("------------- Virtual Proxy Pattern ------------------");

        CustomerList list1 = new CustomerListProxyImpl(); // ohne proxy würde hier DB anfrage passieren
        Company company1 = new Company("Bauwaren Heinz", "Sägestraße 23, München", list1);

        System.out.println("Firmenname: " + company1.getName());

        list1 = company1.getListOfCustomers();

        // wegen proxy Datenbankabfrage also Erzeugen der Liste von CustomerListImpl erst hier
        List<Customer> cusList = list1.getCustomerList();
        for(Customer customer : cusList){
            System.out.println(customer);
        }

    }
}
