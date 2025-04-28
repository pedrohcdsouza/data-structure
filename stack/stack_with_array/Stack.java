public class Stack {

    private int top;
    private Object[] stack;

    public Stack() {
        top = -1;
        stack = new Object[10];
    }

    public void push(Object o){
        if(top == stack.length-1){
            increaseSize();
        }
        stack[++top] = o;
    }

    public Object pop(){
        return stack[top--];
    }

    public Object top(){
        return stack[top];
    }

    public int size(){
        return top + 1;
    }

    public int capacity(){
        return stack.length;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void increaseSize(){
        Object[] newStack = new Object[stack.length*2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }


}