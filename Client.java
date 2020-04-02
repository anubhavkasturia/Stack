class Client{
public static void main(String[] args) {
    Stack mystack =new Stack();
    // System.out.println(mystack.isEmpty());
    // System.out.println(mystack.isFull());
    mystack.push(30);
    mystack.push(20);
    mystack.push(10);
    // mystack.display();
    System.out.println(mystack.peek(0));
}
}