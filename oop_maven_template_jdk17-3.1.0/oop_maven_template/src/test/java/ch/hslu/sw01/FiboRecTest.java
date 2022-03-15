package ch.hslu.sw01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiboRecTest {
    @Test
    void fiboRec1_5() {
        int n = 5;
        FiboRec fiboRec = new FiboRec();

        int result = fiboRec.fiboRec1(n);

        assertEquals(5, result);
    }

    @Test
    void fiboRec1_4() {
        int n = 4;
        FiboRec fiboRec = new FiboRec();

        int result = fiboRec.fiboRec1(n);

        assertEquals(3, result);
    }

    @Test
    void fiboRec1_3() {
        int n = 3;
        FiboRec fiboRec = new FiboRec();

        int result = fiboRec.fiboRec1(n);

        assertEquals(2, result);
    }

    @Test
    void fiboIter_5() {
        int n = 5;
        FiboRec fiboRec = new FiboRec();

        int result = fiboRec.fiboIter(n);

        assertEquals(5, result);
    }

    @Test
    void fiboIter_4() {
        int n = 4;
        FiboRec fiboRec = new FiboRec();

        int result = fiboRec.fiboIter(n);

        assertEquals(3, result);
    }
}