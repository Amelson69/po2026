package lab.lab3;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;


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

        assertEquals(
                Map.of("a", "aaa", "b", "bb", "c", "aaa"),
                tescik1.mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake")))
        );
        assertEquals(
                Map.of("a", "aa", "b", "bbb", "c", "bbb"),
                tescik1.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake")))
        );
        assertEquals(
                Map.of("a", "", "b", "", "c", "cake"),
                tescik1.mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bb", "c", "cake")))
        );
        assertEquals(
                Map.of("a", "", "b", "", "c", "cake"),
                tescik1.mapAB4(new HashMap<>(Map.of("a", "cat", "b", "dog", "c", "cake")))
        );
        assertEquals(
                Map.of("a", "cat", "b", "hound", "c", "hound"),
                tescik1.mapAB4(new HashMap<>(Map.of("a", "cat", "b", "hound", "c", "cake")))
        );
        assertEquals(
                Map.of("a", "", "b", "", "c", "cake"),
                tescik1.mapAB4(new HashMap<>(Map.of("a", "", "b", "", "c", "cake")))
        );



        assertEquals(
                Map.of("b", "g", "c", "e"),
                tescik1.pairs(new String[]{"code", "bug"})
        );

        assertEquals(
                Map.of("m", "n"),
                tescik1.pairs(new String[]{"man", "moon", "main"})
        );

        assertEquals(
                Map.of("g", "d", "m", "n", "n", "t"),
                tescik1.pairs(new String[]{"man", "moon", "good", "night"})
        );

        assertEquals(
                Map.of("g", "d"),
                tescik1.pairs(new String[]{"god"})
        );

        assertEquals(
                Map.of(),
                tescik1.pairs(new String[]{})
        );

        assertEquals(
                Map.of("A", "A"),
                tescik1.pairs(new String[]{"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"})
        );

    }
}