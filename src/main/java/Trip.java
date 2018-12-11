public class Trip {

    private Date start;
    private Date end;
    private String destination;
    private double price;

    public Trip (Date start, Date end, String destination, double price){

        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "start=" + start +
                ", end=" + end +
                ", destination='" + destination + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}