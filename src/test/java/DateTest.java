import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void shouldSplitStringData() {
        String input = "2018-12-01";
        String splitter = "-";

        Date expectedDate = Date.splitString(input,splitter);
        Date actualDate = new Date(2018,12,01);
        
        assertEquals(expectedDate.getYear(),actualDate.getYear());
        assertEquals(expectedDate.getMonth(),actualDate.getMonth());
        assertEquals(expectedDate.getDay(),actualDate.getDay());
    }
}
