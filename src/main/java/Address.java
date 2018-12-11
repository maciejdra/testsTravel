public class Address {

    private String street;
    private String zip;
    private String city;

    public Address(String street, String zip, String city){

        this.street = street;
        this.city = city;
        this.zip = zip;

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}