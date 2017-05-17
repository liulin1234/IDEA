package javaaa;

/**
 * Created by admin on 2017/5/16.
 */

class MyThread implements Runnable{
    private int ticketsCount = 5;//5张票


    @Override
    public void run() {
        while (ticketsCount > 0){
            ticketsCount--;//如果还有票，就卖掉一张
            System.out.println(Thread.currentThread().getName()+"卖了1张票，剩余票数为："+ticketsCount);
        }
    }
}

public class TicketsRunnable {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread thread = new Thread(mt,"窗口1");
        Thread thread2 = new Thread(mt,"窗口2");
        Thread thread3 = new Thread(mt,"窗口3");

        thread.start();
        thread2.start();
        thread3.start();
    }

}
