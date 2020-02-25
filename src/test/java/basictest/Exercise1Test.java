package basictest;

import basic.Exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test

    public void test_timUcln(){
        assertEquals(new Exercise1().timUcln(12,168),12);
        assertEquals(new Exercise1().timUcln(0,20),0);
        assertEquals(new Exercise1().timUcln(20,0),0);
        assertEquals(new Exercise1().timUcln(168,12),12);
        assertEquals(new Exercise1().timUcln(12,12),12);
        assertEquals(new Exercise1().timUcln(169,12),1);
        assertEquals(new Exercise1().timUcln(30,20),10);
        assertEquals(new Exercise1().timUcln(36,28),4);
        assertEquals(new Exercise1().timUcln(5, 15),5);
    }

    @Test
    public void test_timBcnn(){
        new Exercise1().timBcnn(12,168);
    }
}