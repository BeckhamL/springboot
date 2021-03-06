package io.javabrains.springbootstarter.topic;

public class Topic {

    private String id;
    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        super();
        this.description = description;
        this.id = id;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
