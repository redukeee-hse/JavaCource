package collection;

public class CarHashSet implements CarSet  {
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;
    private Entry[] array = new Entry[INITIAL_CAPACITY];
    private static final double LOAD_FACTOR = 0.75;

    @Override
    public boolean add(Car car) {
        if (size >= array.length * LOAD_FACTOR) {
            increaseArray();
        }
        boolean isAdded = add(car, array);
        if (isAdded) {
            size++;
        }
        return isAdded;
    }

    private boolean add(Car car, Entry[] targetArray) {
        int position = getElementPosition(car, targetArray.length);
        if (targetArray[position] == null) {
            Entry entry = new Entry(car, null);
            targetArray[position] = entry;
            return true;
        } else {
            Entry existedElement = targetArray[position];
            while (true) {
                if (existedElement.value.equals(car)) {
                    return false;
                    
                } else if (existedElement.next == null) { 
                    existedElement.next = new Entry(car, null);
                    return true;
                } else {
                    existedElement = existedElement.next;
                }
            }
        }
    }

    @Override
    public boolean remove(Car car) {
        int position = getElementPosition(car, array.length);
        if (array[position] == null) {
            return false;
        } else {
            if (array[position].next == null) {
                array[position] = null;
                size--;
                return true;
            }
            else {
                Entry existedElement = array[position];
                Entry previousElement = array[position];
                existedElement = existedElement.next;
                while (true) {
                    if (existedElement.value.equals(car)) {
                        if (existedElement.next == null) {
                            existedElement = null;
                            size--;
                            return true;
                        } else {
                            previousElement.next = existedElement.next;
                            existedElement = null;
                            size--;
                            return true;
                        }
                    } else {
                        if (existedElement.next == null) {
                            break;
                        }
                        previousElement.next = existedElement;
                        existedElement = existedElement.next;
                    }
                }
                return false;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Entry[INITIAL_CAPACITY];
        size = 0;
    }
    
    private void increaseArray() {
        Entry[] newArray = new Entry[array.length * 2];
        for (Entry entry : array) {
            Entry existedElement = entry;
            while (existedElement != null) {
                add(existedElement.value, newArray);
                existedElement = existedElement.next;
            }
        }
        array = newArray;
    }
    public int getElementPosition(Car car, int arrayLength) {
        return Math.abs(car.hashCode() % arrayLength);
    }

    private static class Entry {
        private Car value;
        private Entry next;
        public Entry(Car value, Entry next) {
            this.value = value;
            this.next = next;
        }

    }
}
