import java.util.*;

public class TravelOffice {

    private Set<Customer> customers = new HashSet<>();
    private Map<String, Trip> trips = new HashMap<>();

    public void addCustomer(Customer customer){

        customers.add(customer);

    }

    void showTrip(){

        for (Customer cs : customers){
            System.out.println(cs.toString());
        }
    }

    void addTrip(String name, Trip trip){

        trips.put(name, trip);

    }

    void removeTrip(String name){

        trips.remove(name);

    }

    public Customer findCustomerByName(String name){

        for (Customer cs : customers){
            if(cs.getName().equals(name)){
                System.out.println("Found");
                return cs;
            }
            else{
            }
        }
        return null;
    }

    boolean removeCustomer(Customer customer){

        if(findCustomerByName(customer.getName()) != null){
            customers.remove(findCustomerByName(customer.getName()));
            System.out.println("Removed");
            return true;
        }
        System.out.println("Not a specified customer");
        return false;
    }
}
