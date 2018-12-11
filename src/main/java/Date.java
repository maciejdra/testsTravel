import java.util.StringTokenizer;

public class Date {

    private int year, month, day;

    public Date(){

    }

    public Date(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }

    public static Date checkString(String string, String punctuation){

        String[] data = string.split(punctuation);
        if(data.length !=3) {

            return null;

        }

        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);
        return new Date(year, month, day);

    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
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
}