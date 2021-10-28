import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashSetTest {
    private MySet<Car> mySet;

    @Before
    public void setUp() throws Exception {
        mySet = new MyHashSet<>();
        for (int i = 0; i < 100; i++) {
            mySet.add(new Car("Brand" + i,i));
        }
    }

    @Test
    public void whenAdd3SimilarObjectsThenSizeIncreaseBy1() {
        assertEquals(100,mySet.size());
        assertTrue(mySet.add(new Car("BMW",10)));
        assertFalse(mySet.add(new Car("BMW",10)));
        assertFalse(mySet.add(new Car("BMW",10)));
        assertEquals(101,mySet.size());

    }

    @Test
    public void whenSetClearedThenSize0() {
        mySet.clear();
        assertEquals(0,mySet.size());
    }
    @Test
    public  void  whenElementRemovedThenSizeDecreased() {
        assertTrue(mySet.remove(new Car("Brand30", 30)));
        assertEquals(99,mySet.size());
        assertFalse(mySet.remove(new Car("Brand30", 30)));
        assertEquals(99,mySet.size());

    }
}