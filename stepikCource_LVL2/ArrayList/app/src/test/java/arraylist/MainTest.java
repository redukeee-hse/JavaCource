package arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    private CarList carList;

    @BeforeEach
    public void setUp() throws Exception {
        carList = new CarArrayList();
        for (int i = 0; i < 10; ++i) {
            carList.add(new Car());
        }
    }

    @Test
    public void whenAdded100ElementsThenSizeIs100() {
        for (int i = 0; i < 90; ++i) {
            carList.add(new Car());
        }
        assertEquals(100, carList.size());
    }

    @Test
    public void whenRemoveAtIndex5ThenSizeIs9() {
        int sizeBefore = carList.size();
        carList.removeAt(5);
        assertEquals(sizeBefore - 1, carList.size());
    }

    @Test
    public void whenElementRemovedThenSizeDecreased() {
        Car car = new Car();
        carList.add(car);
        int sizeBefore = carList.size();
        carList.remove(car);
        assertEquals(sizeBefore - 1, carList.size());
    }

    @Test
    public void whenElementAddedAtIndex0ThenItIsGetAtIndex0() {
        Car car = new Car();
        carList.addAt(car, 0);
        assertEquals(car, carList.get(0));
    }


    @Test
    public void whenInsertAtLastIndexThenItIsGetAtLastIndex() {
        Car car = new Car();
        int lastIndex = carList.size();
        carList.addAt(car, lastIndex);
        assertEquals(car, carList.get(lastIndex));
    }

    @Test
    public void whenInsertAtMiddleIndexThenItIsGetAtMiddleIndex() {
        Car car = new Car();
        int middleIndex = carList.size() / 2;
        carList.addAt(car, middleIndex);
        assertEquals(car, carList.get(middleIndex));
    }

    @Test
    public void whenClearThenSizeIs0() {
        carList.clear();
        assertEquals(0, carList.size());
    }

}
