import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {
    River river;

    @Before
    public void before() {
        river = new River();
    }

    @Test
    public void riverStartsEmpty() {
        assertEquals(0, river.fishCount());
    }

    @Test
    public void canAddFish() {
        Fish newFish = new Fish();
        river.addFish(newFish);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void canRemoveFish() {
        Fish newFish = new Fish();
        river.addFish(newFish);
        Fish removedFish = river.removeFish(newFish);
        assertEquals(0, river.fishCount());
        assertEquals(removedFish, newFish);
    }
}
