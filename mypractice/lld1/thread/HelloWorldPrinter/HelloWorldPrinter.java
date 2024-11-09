package mypractice.lld1.thread.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World 1" +Thread.currentThread().getName());
        System.out.println("Hello World 2 " + Thread.currentThread().getName());
    }
}