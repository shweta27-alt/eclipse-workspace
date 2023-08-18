package Queue_implementation;
import java.util.*;

public class verion1 {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		System.out.println(queue.contains(20));
		System.out.println(queue.contains(40));
		System.out.println(queue.peek());
		
		
		while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
	}

}
