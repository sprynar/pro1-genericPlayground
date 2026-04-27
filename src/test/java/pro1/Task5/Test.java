package pro1.Task5;

import java.time.Instant;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test
{
    @org.junit.Test
    public void test01() throws Exception {

        assertEquals(
                Instant.parse("2026-12-30T07:30:00Z"),
                MyDateParser.parse("2026-12-30 08:30").toInstant()
        );
        assertThrows(
                DateTimeParseException.class,
                () -> MyDateParser.parse("2026-13-45 99:99")
        );
        // TODO: doplň další test, který bude do metody MyDateParser.parse
        //  posílat neplatné datum
    }
}
