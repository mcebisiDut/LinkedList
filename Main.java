public class Main{
    public static void main(String[] args) {
        LinkedListInterface myList = new SingleLinkedList<>();
        myList.AddFront(2);
        myList.AddFront(1);
        myList.AddtBack(4);
        myList.Add(3, 3);
        myList.Display();
        System.out.println("=================================");
        myList.RemoveBack();
        myList.Display();
        System.out.println("=================================");
        myList.RemoveFront();
        myList.Display();
        System.out.println("=================================");
        myList.Add(1,1);
        myList.Display();
        System.out.println("=================================");
    }
}