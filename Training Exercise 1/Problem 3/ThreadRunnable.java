class ThreadRunnable implements Runnable
{  
	public void run()
	{  
		System.out.println("Thread is running...");  
	}  
  
	public static void main(String args[])
	{  
		ThreadRunnable tr=new ThreadRunnable ();  
		Thread t1 =new Thread(tr);  
		t1.start();  
 	}  
}  
