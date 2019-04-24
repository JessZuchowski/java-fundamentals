package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void shopTest() {
        Shop s1 = new Shop("Florist", "colorful delight", 4);
        Shop s2 = new Shop("Plant Nursery", "verdant haven", 5);
        Shop s3 = new Shop("Paper Flowers", "maintenance free beauty", 2);

        assertEquals("Florist", s1.name);
        assertEquals("colorful delight", s1.description);
        assertEquals(4, s1.priceCategory);

        assertEquals("Plant Nursery", s2.name);
        assertEquals("verdant haven", s2.description);
        assertEquals(5, s2.priceCategory);

        assertEquals("Paper Flowers", s3.name);
        assertEquals("maintenance free beauty", s3.description);
        assertEquals(2, s3.priceCategory);
    }

    @Test
    public void toString2() {
        Shop s1 = new Shop("Florist", "colorful delight", 4);
        Shop s2 = new Shop("Plant Nursery", "verdant haven", 5);
        Shop s3 = new Shop("Paper Flowers", "maintenance free beauty", 2);

        String expected1 = "Florist colorful delight 4";
        String actual1 = s1.toString();
        assertEquals(expected1, actual1);

        String expected2 = "Plant Nursery verdant haven 5";
        String actual2 = s2.toString();
        assertEquals(expected2, actual2);

        String expected3 = "Paper Flowers maintenance free beauty 2";
        String actual3 = s3.toString();
        assertEquals(expected3, actual3);
    }

}