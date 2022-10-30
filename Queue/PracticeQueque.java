public class PracticeQueque {
    static class Queque {
        static int arr[];
        static int size;
        static int rear;

        Queque(int n) {
            this.size = n;
            arr = new int[n];
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static void add(int data) {
            if(isFull()) {
                System.out.println("The Queque is full for the " + data + "!");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.print("The Queque is already empty!");
                return - 1;
            }
            int front = arr[0];
            rear--;
            for(int i = 0; i<arr.length - 1; i++) {
                arr[i] = arr[i+1];
            }
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.print("The Queque is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queque q = new Queque(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
