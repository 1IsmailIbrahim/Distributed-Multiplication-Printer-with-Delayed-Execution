package distributed.pkg1;

class Distributed1 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            A a = new A(i);
            Thread t = new Thread(a);
            t.start();
        }
    }
}
