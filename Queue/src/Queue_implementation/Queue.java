package Queue_implementation;

public class Queue {
	int front,rear;
	int capacity;
	int[] array;
	
	Queue(int cap){
		capacity = cap;
		front=-1;
		rear=-1;
		array = new int[capacity];
	}
	
	boolean isFull() {
		if(rear==capacity)
			System.out.println("overflow, can't enqueue");
		return (rear == capacity-1);
	}
	
	boolean isEmpty() {
		if(front == -1)
			System.out.println("underflow, can't dequeue");
		return (front==-1);
	}
	
	void enqueue(int item) {
		if(isFull())
			return;
		if(front==-1)
			front=0;
		
		rear++;
		array[rear]=item;
		System.out.println(item + " enqueued to queue");
	}
	
	
	int dequeue() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		
		int item = array[front];
		front++;
		
		if(front> rear)
			front=rear=-1;
		
		System.out.println(item+" dequeued from queue");
		return item;
	}
	
	
	int front() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		
		return array[front];
	}
	
	
	int rear() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		
		return array[rear];
	}

}


class Temp {
    public static void main(String[] args)
    {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front: " + queue.front());
        System.out.println("Read: " + queue.rear());
    }
}

















