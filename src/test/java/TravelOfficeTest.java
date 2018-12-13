import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class TravelOfficeTest {

    TravelOffice travelOffice;
    DomesticTrip domesticTrip;
    AbroadTrip abroadTrip;

    Set<Customer> customers;
    Map<String, Trip> trips;

    Date start;
    Date end;

    @Before
    public void initialization(){
        travelOffice = new TravelOffice();
        customers = new HashSet<>();
        trips = new HashMap<>();

        start = new Date(2000,01,01);
        end = new Date(2001,01,01);
    }


    @Test
    public void shouldAddCustomer() {
        Customer customer1 = new Customer("Maciej");

        customers.add(customer1);

        assertEquals(1, customers.size());

    }

    @Test
    public void shouldAddTrip() {
        domesticTrip = new DomesticTrip(start,end,"World",200.0,10.0);
        abroadTrip = new AbroadTrip(start,end,"World 2", 100.0,20.0);

        trips.put("Domestic",domesticTrip);
        trips.put("Abroad",abroadTrip);

        assertEquals(2,trips.size());
    }

    @Test
    public void shouldRemoveTrip() {
        domesticTrip = new DomesticTrip(start,end,"World",200.0,10.0);
        abroadTrip = new AbroadTrip(start,end,"World 2", 100.0,20.0);

        trips.put("Domestic",domesticTrip);
        trips.put("Abroad",abroadTrip);

        trips.remove("Domestic");

        assertEquals(1,trips.size());

    }

    @Test
    public void findCustomerByName() {
        String name = "customer";
        Customer customer = new Customer(name);

        customers.add(customer);

        boolean actualOut = customers.contains(customer);
        boolean expectedOut = true;

        assertEquals(actualOut,expectedOut);

    }

    @Test
    public void removeCustomer() {
        Customer customer = new Customer("cust");
        customers.add(customer);
        customers.remove(customer);
        assertFalse(customers.contains(customer));
    }
}
