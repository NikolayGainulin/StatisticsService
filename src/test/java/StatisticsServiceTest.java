import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfMaxInBeginning() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {15, 12, 10, 9, 8};
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfMaxInEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {8, 9, 10, 12, 15};
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10};
        long expected = 10;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-5, -3, -10, -1};
        long expected = -1;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}
