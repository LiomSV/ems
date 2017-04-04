package org.vst.ems.client.model;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class MCall {

    private SimpleLongProperty id = new SimpleLongProperty();
    private SimpleStringProperty createdWhen = new SimpleStringProperty();
    private SimpleStringProperty description = new SimpleStringProperty();

    public MCall() {
    }

    public MCall(long id, String createdWhen, String description) {
        this.id.set(id);
        this.createdWhen.set(createdWhen);
        this.description.set(description);
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

    public String getCreatedWhen() {
        return createdWhen.get();
    }

    public SimpleStringProperty createdWhenProperty() {
        return createdWhen;
    }

    public void setCreatedWhen(String createdWhen) {
        this.createdWhen.set(createdWhen);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }
}
