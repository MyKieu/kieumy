
package basictest;

import basic.Exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
    @Test
    public void test_timTongSoNguyen(){
        assertEquals(new Exercise2().tinhTongSoNguyen(69),15);
        assertEquals(new Exercise2().tinhTongSoNguyen(12),3);
        assertEquals(new Exercise2().tinhTongSoNguyen(7),7);
    }
}