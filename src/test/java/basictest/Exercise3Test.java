package basictest;

import basic.Exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {
    @Test
    public void test_check(){


        assertEquals(new Exercise3().phanTichSoNguyen(1),"1");
        assertEquals(new Exercise3().phanTichSoNguyen(28),"2*2*7");
        assertEquals(new Exercise3().phanTichSoNguyen(90),"2*3*3*5");
        assertEquals(new Exercise3().phanTichSoNguyen(66),"2*3*11");


    }

}
