import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class TravelOfficeTest {

    @Mock
    Set<Customer> customer = new HashSet<>();
    Map<String, Trip> trips = new HashMap<>();

    @InjectMocks
    TravelOffice to;

    @Test
    public void addCustomer() {

        Customer c = new Customer("Maciej");
        int actualOut = customer.size();
        customer.add(c);
        int expectedOut = customer.size();

        assertEquals(actualOut + 1, expectedOut);

    }

    @Test
    public void addTrip() {

        Date start = new Date(2015, 5, 10);
        Date end = new Date(2015,6,1);

        String tr = "Highway";

        Trip t = new Trip(start, end, "Heaven", 55.7);
        int actualOut = trips.size();

        trips.put(tr, t);

        int expectedOut = trips.size();

        assertEquals(actualOut+1,expectedOut);
    }

    @Test
    public void removeTrip() {
        addTrip();
        String tr = "Highway";
        int actualOut = trips.size();
        trips.remove(tr);
        int expectedOut = trips.size();

        assertEquals(actualOut,expectedOut + 1);
    }

    @Test
    public void findCustomerByName() {

        Customer cust = new Customer("Maciej");

        customer.add(cust);

        boolean actualOut = customer.contains(cust);
        boolean expectedOut = true;

        assertEquals(actualOut,expectedOut);
    }

    @Test
    public void removeCustomer() {
        Customer cust = new Customer("Maciej");
        customer.add(cust);

        int actualOut = customer.size();

        customer.remove(cust);

        int expectedOut = customer.size();

        assertEquals(actualOut,expectedOut + 1);

    }
}