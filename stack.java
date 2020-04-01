class Stack{
    int size;
    int top;
    int[] st;

    Stack(){
        this.st=new int[3];
        this.top=-1;
        this.size=st.length;
        
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(top==size-1){
        return true;
        }else{
            return false;
        }
    }
        public void push(int data){
            if(isFull()){
                System.out.println("Stack is full");
            }
            top++;
            st[top]=data;

        }

        public void display(){
            for(int i=top;i>=0;i--){
                System.out.println(st[i]);
            }
        }
    
        public int stackTop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }else{
                return st[top];
            }

        }
        public void pop(){
            if(top==-1){
            System.out.println("Stack is Empty");
            }
            st[top]=0;
            top--; 
          
        }
    }
