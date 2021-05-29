package io.github.lanicc.byteman.test.run;

public class EventsTestRunner {

    private static String NAME = "TEST_RUNNER";

    private long timestamp = System.currentTimeMillis();
    private String[] ids = {"1", "2"};

    public void run() {
        Thread.currentThread().interrupt();
    }

    public void run(int i) {
        System.out.println("run " + i);
    }

    public void read(int i) {
        System.out.println(timestamp);
        System.out.println(NAME);
        System.out.println(ids[1]);
        int localVar = 2;
        System.out.println(localVar);
        System.out.println(i);
    }

    public void write(int i) {
        timestamp = System.currentTimeMillis();
        NAME = "NEW_TEST_RUNNER";
        ids[0] = "001";
        int localVar = 2;
        localVar = 0;
        //noinspection UnusedAssignment
        i++;
    }

    public void newObj() {
        Object o = new Object();
    }

    public void sync() {
        synchronized (this) {
            System.out.println("syn code");
        }
    }

    public void throwException() {
        try {
            throw new RuntimeException("For test");
        } catch (RuntimeException e) {
            System.out.println("Exception");
        }
    }

    public void throwExceptionExit() {
        throw new RuntimeException("For test");
    }

}
