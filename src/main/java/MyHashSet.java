import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashSet<T> implements MySet <T>{

    private Map<T, Object> map = new HashMap<>();
    private Object object = new Object();


    @Override
    public boolean add(T element) {
        if (map.containsKey(element)) {
            return false;
        }
        map.put(element, object);
        return true;
    }


    @Override
    public boolean remove(T element) {
        Object removed = map.remove(element);
        return removed != null;
    }

    @Override
    public boolean contains(T element) {
        return map.containsKey(element);

    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void clear() {
        map.clear();

    }

}