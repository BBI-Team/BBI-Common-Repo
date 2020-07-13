class Queue
{
     private static int front,rear,capacity;
	 private static int queue[];
	 Queue(int c)
	 {
		 front=rear=0;
		 capacity=c;
		 queue=new int[capacity];
	 }
	 static void queueEnqueue(int data)
	 {
		 if(capacity==rear)
		 {
			 System.out.println("Queue is full!!!!");
			 return;
		 }
		 else
		 {
			 queue[rear]=data;
			 rear++;
		 }
		 return;
	 }
	 static void queueDequeue()
	 {
		 if(front==rear)
		 {
			 System.out.println("Queue is empty!!!");
			 return;
		 }
		 else
		 {
			 for(int i=0;i<rear-1;i++)
			 {
				 queue[i]=queue[i+1];
			 }
			 if(rear<capacity)
				 queue[rear]=0;
			 rear--;
		 }
		 return;
	 }
	 static void queueDisplay()
	 {
		 int i;
		 if(front==rear)
		 {
			 System.out.println("Queue is empty!!!");
			 return;
		 }
		 for(i=front;i<rear;i++)
		 {
			 System.out.println(queue[i]);
		 }
		 return;
	 }
	 public static void main(String args[])
	 {
		 Queue q=new Queue(4);
		 System.out.println("After inserting 4 elements in the queue");
		 q.queueEnqueue(10);
		 q.queueEnqueue(20);
		 q.queueEnqueue(30);
		 q.queueEnqueue(40);
		 q.queueDisplay();
		 System.out.println("Try to insert 5th element in the queue");
		 q.queueEnqueue(50);
		 System.out.println("Try to display queue after deleting all elements.....");
		 q.queueDequeue();
		 q.queueDequeue();
		 q.queueDequeue();
		 q.queueDequeue();
		 q.queueDisplay();
	 }
}
