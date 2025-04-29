public class App {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue("OLÁ");
        q.enqueue("MUNDO");
        System.out.println(q.isFull());

    }
}