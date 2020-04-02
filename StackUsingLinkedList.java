
public class StackUsingLinkedList {
    private class Node{
        int data;
        Node next;
    }
    Node top;
    StackUsingLinkedList(){
        this.top=null;
    }
    public boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        Node temp=new Node();
        if(temp==null){
            System.out.println("Heap overflow");
            return true;
        }else{
            return false;
        }
        
    }
    public void push(int data) 
    { 
        
        Node temp = new Node(); 
  
        
        if (temp == null) { 
            System.out.print("Heap Overflow"); 
            return; 
        } 
       temp.data=data;
       temp.next=top;
       top=temp;
    } 
    public void display() 
    { 
        // check for stack underflow 
        if (top == null) { 
            System.out.println("Stack is empty"); 
            
        } 
        else { 
            Node temp = top; 
            while (temp != null) { 
  
                System.out.println(temp.data); 
                temp = temp.next; 
            } 
        } 
    } 
    public int stackTop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        return top.data;
    }
}
