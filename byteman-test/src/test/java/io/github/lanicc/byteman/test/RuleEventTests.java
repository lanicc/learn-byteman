package io.github.lanicc.byteman.test;

import io.github.lanicc.byteman.test.run.EventsTestRunner;
import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitConfig;
import org.jboss.byteman.contrib.bmunit.WithByteman;
import org.junit.jupiter.api.Test;

/**
 * Created on 2021/5/29.
 *
 * @author lan
 * @since 1.0
 */
@WithByteman
@BMUnitConfig(loadDirectory = "target/test-classes")
public class RuleEventTests {


    @BMScript(value = "rule_events/001_atEntryMethod.btm")
    @Test
    void atEntryMethodTest() {
        new EventsTestRunner().run(2);
    }

    @BMScript(value = "rule_events/002_atExitMethod.btm")
    @Test
    void atExitMethodTest() {
        new EventsTestRunner().run(2);
    }

    @BMScript(value = "rule_events/003_atRead.btm")
    @Test
    void atReadTest() {
        new EventsTestRunner().read(2);
    }

    @BMScript(value = "rule_events/004_afterRead.btm")
    @Test
    void afterReadTest() {
        new EventsTestRunner().read(2);
    }

    @BMScript(value = "rule_events/005_atWrite.btm")
    @Test
    void atWriteTest() {
        new EventsTestRunner().write(1);
    }

    @BMScript(value = "rule_events/006_afterWrite.btm")
    @Test
    void afterWriteTest() {
        new EventsTestRunner().write(1);
    }

    @BMScript(value = "rule_events/007_atInvokeMethod.btm")
    @Test
    void atInvokeMethodTest() {
        new EventsTestRunner().run();
    }

    @BMScript(value = "rule_events/008_afterInvokeMethod.btm")
    @Test
    void afterInvokeMethodTest() {
        new EventsTestRunner().run();
    }

    @BMScript(value = "rule_events/009_atNew.btm")
    @Test
    void atNewObjTest() {
        new EventsTestRunner().newObj();
    }

    @BMScript(value = "rule_events/010_afterNew.btm")
    @Test
    void afterNewObjTest() {
        new EventsTestRunner().newObj();
    }

    @BMScript(value = "rule_events/011_atSynchronize.btm")
    @Test
    void atSynchronizeTest() {
        new EventsTestRunner().sync();
    }

    @BMScript(value = "rule_events/012_afterSynchronize.btm")
    @Test
    void afterSynchronizeTest() {
        new EventsTestRunner().sync();
    }

    @BMScript(value = "rule_events/013_atThrow.btm")
    @Test
    void atThrowTest() {
        new EventsTestRunner().throwException();
    }

    @BMScript(value = "rule_events/014_atExceptionExit.btm")
    @Test
    void atExceptionExitTest() {
        try {
            new EventsTestRunner().throwExceptionExit();
        } catch (Exception ignored) {
        }
    }

}
