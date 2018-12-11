import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void shouldSplitDate() {

        String data = "2018-6-25";
        String punctuation = "-";

        Date expectedOut = Date.checkString(data, punctuation);
        Date actualOut = new Date(2018,6,25);
        assertEquals(expectedOut.getYear(), actualOut.getYear());
        assertEquals(expectedOut.getMonth(), actualOut.getMonth());
        assertEquals(expectedOut.getDay(), actualOut.getDay());
    }
}