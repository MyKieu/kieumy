import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Test
    public void test_sum(){
        assertEquals(new Demo().sum(2, 9), 11);
    }

    @Test
    public void test_sub(){
        assertEquals(new Demo().sub(8, 3), 5);
    }

    @Test
    public void test_multiple(){
       assertEquals(new Demo().multiple(2,3), 6);
    }
}