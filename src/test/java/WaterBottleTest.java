import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void testCheckWater() {
        assertEquals(100, waterbottle.checkWater());
    }

    @Test
        public void haveDrink () {
            assertEquals(90, waterbottle.haveDrink());
    }

    @Test
        public void empty () {
            assertEquals(0, waterbottle.empty());
    }

    @Test
        public void refill(){
            assertEquals(100,waterbottle.refill());
    }
}



