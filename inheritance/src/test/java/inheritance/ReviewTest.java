package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void reviewTest() {
        Review rev1 = new Review("Top notch", "anon1", 4);
        Review rev2 = new Review("would recommend", "anon2", 3);
        Review rev3 = new Review("great spot", "anon3", 4);

        assertEquals("Top notch", rev1.body);
        assertEquals("anon1", rev1.author);
        assertEquals(4, rev1.numberOfStars);

        assertEquals("would recommend", rev2.body);
        assertEquals("anon2", rev2.author);
        assertEquals(3, rev2.numberOfStars);

        assertEquals("great spot", rev3.body);
        assertEquals("anon3", rev3.author);
        assertEquals(4, rev3.numberOfStars);


    }

    @Test
    public void toString1() {
    }
}