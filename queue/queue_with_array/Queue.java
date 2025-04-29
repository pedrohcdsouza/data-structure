public class Queue{

    private int N;
    private int i;
    private int f;
    private Object[] queue;

    public Queue(){
        N = 2;
        i = 0;
        f = 0;
        queue = new Object[N];
    }

    public void enqueue(Object o);

        queue[f++] = o;
    }

    public Object dequeue(){
        if(isEmpty()) {
            return System.out.println("Queue is empty");
        }
        return queue[i++];
    }

    public bool isEmpty(){
        return (i==f);
    }

    public bool isFull() {
        int size = (N - 1 + f) % N;
        return(size + 1 >= N);
    }
}