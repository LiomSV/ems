package org.vst.ems.client.model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleLongProperty;

public class MCrew {

    private SimpleLongProperty id = new SimpleLongProperty();
    private SimpleLongProperty currentCallId = new SimpleLongProperty();
    private SimpleBooleanProperty busy = new SimpleBooleanProperty();

    public MCrew() {
    }

    public MCrew(long id, Long currentCallId, boolean busy) {
        this.id.set(id);
        this.currentCallId.setValue(currentCallId);
        this.setBusy(busy);
    }

    public long getId() {
        return id.get();
    }

    public SimpleLongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public long getCurrentCallId() {
        return currentCallId.get();
    }

    public SimpleLongProperty currentCallIdProperty() {
        return currentCallId;
    }

    public void setCurrentCallId(long currentCallId) {
        this.currentCallId.set(currentCallId);
    }

    public boolean isBusy() {
        return busy.get();
    }

    public SimpleBooleanProperty busyProperty() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy.set(busy);
    }
}
