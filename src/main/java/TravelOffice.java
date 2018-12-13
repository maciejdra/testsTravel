import java.util.*;

public class TravelOffice {

    private Set<Customer> customers = new HashSet<>();
    private Map<String, Trip> trips = new HashMap<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void addTrip(String name, Trip trip){
        trips.put(name,trip);
    }

    public int getCustomerCount(){
        return customers.size();
    }

    boolean removeTrip(String name){
        if(trips.containsKey(name)){
            trips.remove(name);
            return true;
        }
        else return false;
    }

    Customer findCustomerByName(String name){
        Customer customer = new Customer("Finder");
        for (Customer c : customers){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return customer;
    }

    boolean removeCustomer(Customer customer){
        for (Iterator<Customer> iterator = customers.iterator(); iterator.hasNext();){
            Customer c = iterator.next();
            if(c.equals(customer)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Set<Customer> getAllCustomers() {
        return customers;
    }

    public Map<String, Trip> getAllTrips() {
        return trips;
    }

    @Override
    public String toString() {
        String raport = "";
        for(Customer c : customers){
            if(c != null){
                raport += c.toString();
            }
        }
        return raport;
    }
}
