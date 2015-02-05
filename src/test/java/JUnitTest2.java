import org.junit.*;

/**
 * Created by DotinSchool2 on 2/3/2015.
 */
public class JUnitTest2 {
    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
    }
}
