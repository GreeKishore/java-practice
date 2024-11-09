package mypractice.lld1.thread.numberprinter;

public class Client {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread th = new Thread(numberPrinter);
            th.start();
        }
    }
}