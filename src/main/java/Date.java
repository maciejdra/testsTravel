public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static Date splitString(String input, String splitter){
        String[] data = input.split(splitter);
        if(data.length != 3){
            return null;
        }
        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);
        return new Date(year,month,day);
    }

    @Override
    public String toString() {
        return "Year: " + year +
                " month: " + month +
                " day: " + day + "\n";
    }
}
