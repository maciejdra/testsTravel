public class Test {

    public static void main(String[] args) {

        TravelOffice to = new TravelOffice();

        Address address = new Address("Krzem", "59-300", "Lubin");

        Customer customer1 = new Customer("Maciej");
        Customer customer2 = new Customer("Filip");

        DomesticTrip domeseticTrip = new DomesticTrip(new Date(2018, 6, 15), new Date(2018, 6, 25), "Wroclaw",1000,200);
        AbroadTrip abroadTrip = new AbroadTrip(new Date(2018, 11, 15), new Date(2018, 11, 19), "Warszawa",1000,100);

        customer1.setTrip(domeseticTrip);
        customer2.setTrip(abroadTrip);

        to.addCustomer(customer1);
        to.addCustomer(customer2);

        //System.out.println(customer1);
        //System.out.println(customer2);

        to.showTrip();
        to.addTrip("Wies", domeseticTrip);
        to.removeTrip("Wies");

        //to.addCustomer(customer1);
        //to.addCustomer(customer2);
        to.removeCustomer(customer1);
        to.showTrip();



        //System.out.println(to);

    }
}
