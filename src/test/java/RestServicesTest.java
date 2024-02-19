import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.RestServices;

public class RestServicesTest {
    @Test
    void calcMonths() {
        RestServices services = new RestServices();
        long expected = 3;
        long actual = services.RestServices(10000, 3000,  20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcMonthsSecond() {
        RestServices services = new RestServices();
        long expected = 2;
        long actual = services.RestServices(100000, 60000,  150000);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/dates.csv")
    void calcMonths (int income, int expenses, int threshold, int expected) {
        RestServices service = new RestServices();
        int actual = service.RestServices(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
