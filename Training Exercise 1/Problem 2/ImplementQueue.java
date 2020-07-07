
class ImplementQueue { 
	static int front, rear, capacity; 
 	static int queue[]; 

	ImplementQueue(int c) 
	{ 
		front = 0;
		rear = 0; 
		capacity = c; 
		queue = new int[capacity]; 
	} 

	static void queueEnqueue(int data)  				//entry in queue
	{ 
 
		if (capacity == rear) { 
			System.out.printf("\nQueue is full\n"); 
			return; 
		} 

		else { 
			queue[rear] = data; 
			rear++; 
		} 
		return; 
	} 
 
	static void queueDequeue()       				//exit from queue
	{ 
		
		if (front == rear) { 
			System.out.printf("\nQueue is empty\n"); 
			return; 
		}  
		else{ 
			for (int i = 0; i < rear - 1; i++) { 
				queue[i] = queue[i + 1]; 
			} 
			if (rear < capacity) 
				queue[rear] = 0; 

			rear--; 
		} 
		return; 
	} 

	static void queueDisplay() 					//displaying queue
	{ 
		int i; 
		if (front == rear) { 
			System.out.printf("\nQueue is Empty\n"); 
			return; 
		} 
		for (i = front; i < rear; i++) { 
			System.out.printf(" %d | ", queue[i]); 
		} 
		return; 
	} 

	static void queueFront() 					//Displaying front element
	{ 
		if (front == rear) { 
			System.out.printf("\nQueue is Empty\n"); 
			return; 
		} 
		System.out.printf("\nFront Element is: %d", queue[front]); 
		return; 
	} 
 
	public static void main(String[] args) 
	{ 
		ImplementQueue q = new ImplementQueue(4); 
		q.queueDisplay(); 

		q.queueEnqueue(1000); 
		q.queueEnqueue(3000); 
		q.queueEnqueue(4000); 
		q.queueEnqueue(5000); 

		q.queueDisplay(); 

		q.queueEnqueue(6000); 
 
		q.queueDisplay(); 

		q.queueDequeue(); 
		q.queueDequeue(); 
		System.out.printf("\n\nAfter two node deletion\n\n"); 

		q.queueDisplay(); 

		q.queueFront(); 
	} 
 }
