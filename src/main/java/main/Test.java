package main;

public class Test {

    public void syn(String name, Test test) {
        synchronized (test) {
            for (int i = 0; i < 10; i++) {
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
        }

    }


    public void fun(String name, Test test) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        synchronized (test) {
            for (int i = 0; i < 10; i++) {
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
        }
    }
}