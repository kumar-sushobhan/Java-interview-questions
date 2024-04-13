package com.sushobhan.exam;

import java.util.ListResourceBundle;

public class MsgBundle7 extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
            {"language", "Python"},
            {"platform", "Unix"}
    };
}
