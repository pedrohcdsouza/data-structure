public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.top());
        System.out.println(stack.capacity());

        stack.push(11);
        System.out.println(stack.top());
        System.out.println(stack.capacity());

    }
}