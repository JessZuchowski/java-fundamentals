package inheritance;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RestaurantTest1 {

    @Test
    public void restaurantTest() {
        Restaurant r1 = new Restaurant(4, "CJs Pub", 4);
        Restaurant r2 = new Restaurant(3, "DDs Tavern", 3);
        Restaurant r3 = new Restaurant(5, "MZs Pour House", 4);

        assertEquals(4, r1.numberOfStars);
        assertEquals("CJs Pub", r1.name);
        assertEquals(4, r1.priceCategory);

        assertEquals(3, r2.numberOfStars);
        assertEquals("DDs Tavern", r2.name);
        assertEquals(3, r2.priceCategory);

        assertEquals(5, r3.numberOfStars);
        assertEquals("MZs Pour House", r3.name);
        assertEquals(4, r3.priceCategory);
    }

    @Test
    public void toString1() {

    }

    @Test
    public void main() {
    }
}