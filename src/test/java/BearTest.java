import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;

    @Before
    public void before() {
        bear = new Bear("Baloo");
    }

    @Test
    public void hasName() {
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void bellyStartsEmpty() {
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEat() {
        Fish fish = new Fish();
        bear.eat(fish);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping() {
        Fish fish = new Fish();
        bear.eat(fish);
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }
}
