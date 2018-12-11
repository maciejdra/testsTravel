public class DomesticTrip extends Trip {

    private double ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination, double price, double ownArrivalDiscount) {
        super(start, end, destination, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount){

        this.ownArrivalDiscount = ownArrivalDiscount;

    }

    public double getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() -getOwnArrivalDiscount() ;
    }
}
