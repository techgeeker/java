package org.michaelliu.demo.java.designpattern.behavior.chainofresponsibility;

/**
 * Created by Michael on 7/4/16.
 */
public class FinalHandler extends BaseHandler {

    public FinalHandler() {
        this.type = "Final Handler";
    }

    @Override
    protected int getAllowance() {
        return 200000;
    }

}
