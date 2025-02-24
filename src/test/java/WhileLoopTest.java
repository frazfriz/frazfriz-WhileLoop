

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WhileLoopTest {
    static Lab wl;
    @BeforeClass
    public static void setUp(){
        wl = new Lab();
    }

    /**
     * A while loop summing all numbers between 0 and 3 exclusive should result in an expected value of 3.
     * 0+1+2 = 3
     */
    @Test
    public void whileLoopTest1(){
        int input = 0;
        int expected = 0;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * A while loop summing all numbers between 0 and 5 exclusive should result in an expected value of 10.
     * 0+1+2+3+4 = 10
     */
    @Test
    public void whileLoopTest2(){
        int input = 0;
        int expected = 10;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * A while loop summing all numbers between 0 and 6 exclusive should result in an expected value of 3.
     * 0+1+2+3+4+5 = 15
     */
    @Test
    int sum = 0;
int i = 0;
while (i < 6) {
    sum += i;
    i++;
}
System.out.println(sum); // Output: 15

    }
    /**
     * A while loop summing all numbers between 0 and 0 exclusive should result in an expected value of 0.
     */
    @Test
    public void whileLoopTest4(){
        int input = 0;
        int expected = 0;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
}
