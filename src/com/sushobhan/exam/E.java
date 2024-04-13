package com.sushobhan.exam;

import java.util.prefs.NodeChangeEvent;
import java.util.prefs.NodeChangeListener;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;

public class E implements PreferenceChangeListener, NodeChangeListener {


    @Override
    public void preferenceChange(PreferenceChangeEvent evt) {
        System.out.format("Preference change at Node: %s, key: %s, value: %s\n", evt.getNode().name(), evt.getKey(), evt.getNewValue());
    }

    @Override
    public void childAdded(NodeChangeEvent evt) {

    }

    @Override
    public void childRemoved(NodeChangeEvent evt) {

    }
}
