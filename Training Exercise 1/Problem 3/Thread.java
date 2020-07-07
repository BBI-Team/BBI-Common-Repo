/*A thread is actually a lightweight process. Unlike many other computer languages, Java provides built-in support for multithreaded programming. A multithreaded program contains two or more parts that can run concurrently. Each part of such a program is called a thread and each thread defines a separate path of the execution. Thus, multithreading is a specialized form of multitasking.*/
/*The Java run-time system depends on threads for many things. Threads reduce inefficiency by preventing the waste of CPU cycles.

Threads exist in several states:

New - When we create an instance of Thread class, a thread is in a new state.
Running - The Java thread is in running state.
Suspended - A running thread can be suspended, which temporarily suspends its activity. A suspended thread can then be resumed, allowing it to pick up where it left off.
Blocked - A Java thread can be blocked when waiting for a resource.
Terminated - A thread can be terminated, which halts its execution immediately at any given time. Once a thread is terminated, it cannot be resumed.*/



class MyThread implements Runnable {
String name;
Thread t;
    MyThread String thread){
    name = threadname; 
    t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start();
}
public void run() {
 try {
     for(int i = 5; i > 0; i--) {
     System.out.println(name + ": " + i);
      Thread.sleep(1000);
}
}catch (InterruptedException e) {
     System.out.println(name + "Interrupted");
}
     System.out.println(name + " exiting.");
}
}
class MultiThread {
public static void main(String args[]) {
     new MyThread("One");
     new MyThread("Two");
     new NewThread("Three");
try {
     Thread.sleep(10000);
} catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
}
      System.out.println("Main thread exiting.");
      }
}
