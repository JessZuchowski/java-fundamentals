package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void theaterTest() {
        Theater t1 = new Theater("C6", "6 current movies", 3);
        Theater t2 = new Theater("Granada", "2 older movies", 2);
        Theater t3 = new Theater("Mega21", "21 of the best movies in 3D", 4);

        assertEquals("C6", t1.name);
        assertEquals("6 current movies", t1.allTheMovies);
        assertEquals(3, t1.priceCategory);

        assertEquals("Granada", t2.name);
        assertEquals("2 older movies", t2.allTheMovies);
        assertEquals(2, t2.priceCategory);

        assertEquals("Mega21", t3.name);
        assertEquals("21 of the best movies in 3D", t3.allTheMovies);
        assertEquals(4, t3.priceCategory);
    }

    @Test
    public void toString4() {
        Theater t1 = new Theater("C6", "6 current movies", 3);
        Theater t2 = new Theater("Granada", "2 older movies", 2);
        Theater t3 = new Theater("Mega21", "21 of the best movies in 3D", 4);

        String expected1 = "C6 6 current movies 3";
        String actual1 = t1.toString();
        assertEquals(expected1, actual1);

        String expected2 = "Granada 2 older movies 2";
        String actual2 = t2.toString();
        assertEquals(expected2, actual2);

        String expected3 = "Mega21 21 of the best movies in 3D 4";
        String actual3 = t3.toString();
        assertEquals(expected3, actual3);
    }

}