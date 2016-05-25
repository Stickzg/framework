package com.vaadin.tests.components.nativeselect;

import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.components.AbstractTestUIWithLog;
import com.vaadin.ui.NativeSelect;

public class NativeSelectNull extends AbstractTestUIWithLog {
    @Override
    protected void setup(VaadinRequest request) {
        NativeSelect nativeSelect = new NativeSelect();
        nativeSelect.addItem("Item");
        nativeSelect.addValueChangeListener(new ValueChangeListener() {

            @Override
            public void valueChange(ValueChangeEvent event) {
                log("Value: " + event.getProperty().getValue());

            }
        });
        addComponent(nativeSelect);
    }

}
