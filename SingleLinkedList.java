public class SingleLinkedList<T> implements LinkedListInterface<T> {
    private int size;
    private ListNode head;

    SingleLinkedList() {
        size = 0;
        head = null;
    }

    public boolean IsEmpty() {
        return (size == 0);
    }

    public void AddFront(T item) {
        head = new ListNode<T>(item, head);
        size++;
    }

    public void AddBack(T item) {
        ListNode oldTail = GetTail();
        ListNode tail = new ListNode<T>(item);
        oldTail.SetNext(tail);
        size++;
    }

    public void Add(T item, int position) {
        if (Valid(position)) {
            if (position == 1) {
                AddFront(item);
            } else {
                ListNode current = GetNodeBefore(position);
                ListNode newNode = new ListNode<T>(item, current.GetNext());
                current.SetNext(newNode);
            }
            size++;
        }
    }

    public void RemoveFront() {
        head = head.GetNext();
        size --;
    }

    public void RemoveBack() {
        ListNode tail = GetNodeBefore(size);
        tail.SetNext(null);
        size --;
    }

    public void Display() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.GetItem());
            current = current.GetNext();
        }
    }

    private ListNode GetTail() {
        ListNode tail = head;
        while (tail.GetNext() != null) {
            tail = tail.GetNext();
        }
        return tail;
    }

    private boolean Valid(int position) {
        return (position > 0 && position <= size);
    }

    private ListNode GetNodeBefore(int position) {
        ListNode current = head;
        int count = 1;
        while (count < position - 1) {
            current = current.GetNext();
            count++;
        }
        return current;
    }
}
