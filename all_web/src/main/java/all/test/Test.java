package all.test;

public class Test {


    public void aa(int a){
        synchronized (Test.class){
            System.out.println("进入aa:"+a);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束aa:"+a);
        }
    }

    public void bb(int b){
        synchronized (this){
            System.out.println("进入bb:"+b);
            System.out.println("结束bb:"+b);
        }
    }

    public synchronized void cc(int c){
        System.out.println("进入cc:"+c);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束cc:"+c);
    }

    public static void main(String[] args) {


        new Thread(new Runnable() {
            Test t = new Test();
            public void run() {
                t.cc(1);
            }
        }).start();
        new Thread(new Runnable() {
            Test t = new Test();
            public void run() {
                t.cc(2);
            }
        }).start();
    }

}
