package mypractice.lld1.thread.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
            Thread thread = new Thread(helloWorldPrinter);
            System.out.println("Hello from Main ...." +Thread.currentThread().getName());
            System.out.println("1 " + Thread.currentThread().getName());
            thread.start();
            System.out.println("2 " + Thread.currentThread().getName());
        }
    }
}