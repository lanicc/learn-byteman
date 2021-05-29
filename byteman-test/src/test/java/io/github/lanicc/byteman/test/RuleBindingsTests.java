package io.github.lanicc.byteman.test;

import io.github.lanicc.byteman.test.run.BindingsTestRunner;
import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitConfig;
import org.jboss.byteman.contrib.bmunit.WithByteman;
import org.junit.jupiter.api.Test;

@WithByteman
@BMUnitConfig(loadDirectory = "target/test-classes")
public class RuleBindingsTests {


    @BMScript(value = "rule_bindings/001_bindings.btm")
    @Test
    void bindingsTest() {
        new BindingsTestRunner().run();
    }

}
