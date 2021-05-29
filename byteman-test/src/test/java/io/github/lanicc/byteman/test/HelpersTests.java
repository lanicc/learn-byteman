package io.github.lanicc.byteman.test;

import io.github.lanicc.byteman.test.run.HelperTestRunner;
import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitConfig;
import org.jboss.byteman.contrib.bmunit.WithByteman;
import org.junit.jupiter.api.Test;

@WithByteman
@BMUnitConfig(loadDirectory = "target/test-classes")
public class HelpersTests {

    @BMScript(value = "rule_helpers/001_echoRuleHelper.btm")
    @Test
    void echoHelperTest() {
        new HelperTestRunner().run();
    }
}
