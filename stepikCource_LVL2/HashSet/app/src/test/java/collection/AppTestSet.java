package collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class AppTestSet extends AbstractTestCollection<CarSet> {

    @Override
    protected CarSet createCollection() {
        return new CarHashSet();
    }

    @BeforeEach 
    void setUp() {
        collection = createCollection();
        for (int i = 0; i < 100; i++) {
            collection.add(new Car(i));
        }
    }

    @Test
    public void whenElementAddedThenSizeIncreased() {
        Car car1 = new Car(150);
        collection.add(car1);
        assertEquals(101, collection.size());
    }

    @Test
    public void whenElementRemovedThenSizeDecreased() {
        Car car1 = new Car(50);
        collection.remove(car1);
        assertEquals(99, collection.size());
    }

    @Test 
    public void whenCollectionClearedThenSizeZero() {
        collection.clear();
        assertEquals(0, collection.size());
    }

    @Test
    public void whenSizeCalledThenCorrectSizeReturned() {
        assertEquals(100, collection.size());
    }
}