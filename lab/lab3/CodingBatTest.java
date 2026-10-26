package lab.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat tescik1 = new CodingBat();

    @org.junit.Test
    public void array123() {
        assertEquals(true, tescik1.array123(new int[] {1,2,3}));
        assertEquals(false, tescik1.array123(new int[] {1,2,4}));
        assertEquals(true, tescik1.array123(new int[] {1,2,3,2,3}));
        assertEquals(false, tescik1.array123(new int[] {6,7,8}));
        assertEquals(true, tescik1.array123(new int[] {1,2,3,1,2,3}));
        assertEquals(false, tescik1.array123(new int[] {0,0,0,0,0,0,0,0,0}));
    }
}