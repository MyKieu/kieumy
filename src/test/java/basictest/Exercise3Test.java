package basictest;

import basic.Exercise3;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class Exercise3Test {
    @Test
    public void test_check(){


        assertNotEquals(new Exercise3().phanTichSoNguyen(1),1);
        assertNotEquals(new Exercise3().phanTichSoNguyen(2),2);
        assertNotEquals(new Exercise3().phanTichSoNguyen(28),2*2*7);
        assertNotEquals(new Exercise3().phanTichSoNguyen(12),2*2*3);
        assertNotEquals(new Exercise3().phanTichSoNguyen(600),2 * 2 * 2 * 3 * 5 * 5);

    }

}
