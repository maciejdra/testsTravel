public class Test {

    public static void main(String[] args) {
        TravelOffice travelOffice = new TravelOffice();

        Address address1 = new Address("Krzemieniecka 18A","59-300","Lubin");
        Address address2 = new Address("Wyzwolenia","62-700","Turek");

        Customer customer1 = new Customer("Maciej");
        Customer customer2 = new Customer("Artur");

        Date start1 = new Date(2018,12,6);
        Date start2 = new Date(2017,12,6);

        Date end1 = new Date(2018,12,12);
        Date end2 = new Date(2017,12,12);

        DomesticTrip domesticTrip = new DomesticTrip(start1,end1, "Lodz", 500.0,150.0);
        AbroadTrip abroadTrip = new AbroadTrip(start2,end2, "Warszawa", 550.0,170.0);

        customer1.setAddress(address1);
        customer2.setAddress(address2);

        customer1.assignTrip(domesticTrip);
        customer2.assignTrip(abroadTrip);

        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);

        System.out.println(travelOffice);
    }
}
