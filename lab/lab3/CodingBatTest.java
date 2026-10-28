package lab.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat tescik1 = new CodingBat();

    @org.junit.Test
    public void tests() {
        assertTrue(tescik1.array123(new int[]{1, 2, 3}));
        assertFalse(tescik1.array123(new int[]{1, 2, 4}));
        assertTrue(tescik1.array123(new int[]{1, 2, 3, 2, 3}));
        assertFalse(tescik1.array123(new int[]{6, 7, 8}));
        assertTrue(tescik1.array123(new int[]{1, 2, 3, 1, 2, 3}));
        assertFalse(tescik1.array123(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}));

        assertEquals(0, tescik1.array667(new int[]{1, 2, 3}));
        assertEquals(1, tescik1.array667(new int[]{6, 7, 8}));
        assertEquals(2, tescik1.array667(new int[]{6, 6, 6}));
        assertEquals(2, tescik1.array667(new int[]{6, 6, 8, 6, 7}));
        assertEquals(1, tescik1.array667(new int[]{1, 2, 3, 6, 6}));
        assertEquals(0, tescik1.array667(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}));

        assertEquals("Hlo", tescik1.stringBits("Hello"));
        assertEquals("Aaei", tescik1.stringBits("Akademia"));
        assertEquals("Griz", tescik1.stringBits("Gorniczo"));
        assertEquals("Htiz", tescik1.stringBits("Hutnicza"));
        assertEquals("iina", tescik1.stringBits("imienia"));
        assertEquals("Sailw", tescik1.stringBits("Stanislawa"));
    }
}