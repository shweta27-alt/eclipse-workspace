package Queue_implementation;

public class CircularQueue {
	int front, rear;
	int capacity;
	int curr_size;
	int[] a;
	
	CircularQueue(int cap){
		capacity = cap;
		front= -1;
		rear = -1;
		curr_size = 0;
		a = new int[capacity];
	}
	
	boolean isFull() {
		return (front == rear+1) || (front==0 && rear == capacity-1);
	}
	
	boolean isEmpty() {
		return front == -1;
	}
	
	void enqueue(int item) {
		if(isFull())
			System.out.println("can't add the queue is full");
		
		else {
			if(front == -1)
				front=0;
			
			rear= (rear+1)%capacity;
			a[rear]= item;
			System.out.println(item+" was added");
		}
	}
	
	int dequeue()
    {
        int item;
        if (isEmpty())
        {
            System.out.println("Can't add the queue is empty");
            return (Integer.MIN_VALUE);
        }
        else
        {
            item = a[front];
            if (front == rear)
            {
                front = rear = -1 ;
            }
            else
            {
                front = (front + 1) % capacity;
            }
            System.out.println(item +  " dequeued");
            return item;
        }
    }
	
	  int front()
	    {
	        if (isEmpty())
	            return Integer.MIN_VALUE;

	        return a[front];
	    }

	    // Method to get rear of queue
	    int rear()
	    {
	        if (isEmpty())
	            return Integer.MIN_VALUE;

	        return a[rear];
	    }

	    void display()
	    {
	        int i;
	        if (isEmpty())
	            System.out.println("Empty Queue");
	        else {

	            System.out.println("\nQueue: ");
	            for (i = front; i != rear; i = (i + 1) % capacity) {
	                System.out.print(a[i]+ " ");
	            }
	            System.out.println(a[i]);

	        }
	    }

}












