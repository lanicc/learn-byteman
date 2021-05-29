package io.github.lanicc.byteman.test.helper;

import org.jboss.byteman.rule.Rule;
import org.jboss.byteman.rule.helper.Helper;

public class EchoHelper extends Helper {
    protected EchoHelper(Rule rule) {
        super(rule);
    }

    @Override
    public boolean traceln(String message) {
        System.out.println("Echo: " + message);
        return true;
    }
}
