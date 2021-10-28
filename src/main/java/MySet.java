public interface MySet<T> {
    boolean add(T element);
    boolean remove(T element);
    int size();
    void clear();
    boolean contains(T element);

}
