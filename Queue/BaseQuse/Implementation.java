package BaseQuse;

public class Implementation {

    static class Queue {
        
       static int arr[];
       static int size;
        static int rear;
        static int front;
        
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        public static boolean isEmpty(){
            return rear == -1;

        }

        // this funcation is circular Queue
        // isfull()

        public static boolean isfull(){
            return (rear +1)%size == front;
        }

        //add
        public static void add(int data){
            // if (rear == size-1) {
            //     System.out.println("queue is full:");
            //     return;
            // }

            // rear = rear +1;
            // arr[rear] = data;


            // this method is circular queue 
            if (isfull()) {
                System.out.println("Queue is full:");
                return;
            }

            // dad !st element
            if (front==-1) {
                front = 0;

            }
            rear = (rear +1) %size;
            arr[rear] = data;

        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty queu");
                return -1;
            }

            // int front = arr[0];
            // for(int i=0; i<rear; i++){
            //     arr[i] = arr[i+1];

            // }

            // rear = rear-1;
            // return front;

            // this method is circular queue 

            int result = arr[front];
            //front = (front +1)%size;
            //last el delete 
            if (rear == front) {
                rear = front = -1;
            }
            else{
                front = (front +1)%size;
            }
            return result;
          

           
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty queu");
                return -1;
            }
            
          //  return arr[0];
          return arr[front];
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);


        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
