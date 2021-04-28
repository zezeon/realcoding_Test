import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트를 진행합니다.
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        /*테스트 코드 입력*/
        assertTrue(result == 20);
    }

    @Test
    public void subtractTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,2);
        /*테스트 코드 입력*/
        assertTrue(result == 8);
    }

    @Test
    public void multiplyTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(3,3);
        /*테스트코드 입력*/
        assertTrue(result == 9);
    }

    @Test
    public void divideTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10,2);
        /*테스트 코드 입력*/
        assertTrue(result == 5);
    }
}