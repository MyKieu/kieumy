package basictest;

import basic.Exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
    @Test
    public void Sum(){
        assertEquals(new Exercise2().tongSoNguyen(1234),10);
        assertEquals(new Exercise2().tongSoNguyen(34782),24);
        assertEquals(new Exercise2().tongSoNguyen(9830),20);
        assertEquals(new Exercise2().tongSoNguyen(5664),21);
    }
}
