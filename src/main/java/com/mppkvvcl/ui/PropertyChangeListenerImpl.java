//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JProgressBar;

public class PropertyChangeListenerImpl implements PropertyChangeListener {
    private JProgressBar billGenerationProgressbar;

    public PropertyChangeListenerImpl(JProgressBar billGenerationProgressbar) {
        this.billGenerationProgressbar = billGenerationProgressbar;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress".equals(evt.getPropertyName())) {
            this.billGenerationProgressbar.setValue((Integer)evt.getNewValue());
        }

    }
}
