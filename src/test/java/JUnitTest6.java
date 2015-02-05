import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by DotinSchool2 on 2/3/2015.
 */
@RunWith(value = Parameterized.class)
public class JUnitTest6 {
    private int numberA;
    private int numberB;
    private int expected;

    //parameters pass via this constructor
    public JUnitTest6(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    //Declares parameters here
    @Parameterized.Parameters(name = "{index}: add({0}+{1})={2}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9}
        });
    }

    @Test
    public void test_add() {
        assertEquals(expected,MathUtils.add(numberA, numberB));
    }
}
