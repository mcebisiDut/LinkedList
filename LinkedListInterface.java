public interface LinkedListInterface<T> {
    public boolean IsEmpty();
    public void AddFront (T item);
    public void AddtBack(T item);
    public void Add(T item, int position);
    public void RemoveFront ();
    public void RemoveBack();
    public void Display();
}