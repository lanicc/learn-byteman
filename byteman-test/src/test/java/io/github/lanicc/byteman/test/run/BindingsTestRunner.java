package io.github.lanicc.byteman.test.run;

public class BindingsTestRunner {

    private int id = 2;

    private Thread thread = Thread.currentThread();

    public void run() {
        System.out.printf("id: %d, run method%n", id);
    }

    public int add(int i, int j) {
        return Math.addExact(i, j);
    }
}
