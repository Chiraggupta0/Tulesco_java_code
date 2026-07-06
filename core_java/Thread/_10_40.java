// thread priority 
// priority-- 1 to 10 with 1 as highest and 10 as lowest and 5 as default
package core_java.Thread;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            // if we want out code to wait then we use :
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class _10_40 { 
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        // it will give the priority
        System.out.println(obj1.getPriority());
        obj2.setPriority(1);
        // we can also write upper statement as:
        // obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();

    }

}
