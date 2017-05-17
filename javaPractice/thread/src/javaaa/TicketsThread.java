package javaaa;

/**
 * Created by admin on 2017/5/16.
 */

class Mythread extends  Thread{
    private int ticketsCount = 5;//5张票
    private String name;

    public Mythread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        while (ticketsCount > 0){
            ticketsCount--;//如果还有票，就卖掉一张
            System.out.println(name+"卖了1张票，剩余票数为："+ticketsCount);
        }
    }
}

public class TicketsThread {

    public static void main(String[] args) {
        Mythread mythread = new Mythread("窗口1");
        Mythread mythread2 = new Mythread("窗口2");
        Mythread mythread3 = new Mythread("窗口3");

        mythread.start();
        mythread2.start();
        mythread3.start();

    }

}
