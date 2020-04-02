
public class ClientLL {
    public static void main(String[] args) {
        StackUsingLinkedList sll=new StackUsingLinkedList();
        // System.out.println(sll.isEmpty());
        // System.out.println(sll.isFull());
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        // sll.display();
        System.out.println(sll.stackTop());
    }

}