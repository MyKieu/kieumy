package basictest;

import basic.Exercise3;

import org.junit.Test;


import static org.junit.Assert.assertNotEquals;

public class Exercise3Test {
    @Test
    public void test_check(){
        assertNotEquals(new Exercise3().phanTichSoNguyen(1),1);
        assertNotEquals(new Exercise3().phanTichSoNguyen(12),2*2*3);
        assertNotEquals(new Exercise3().phanTichSoNguyen(66),2*3*11);


    }

}
