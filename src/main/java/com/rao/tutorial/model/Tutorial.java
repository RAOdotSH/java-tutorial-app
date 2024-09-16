package com.rao.tutorial.model;
import jakarta.persistence.*;

@Entity // Indicates that this class is a persisten java class.
@Table(name = "tutorials") // Table mapping
public class Tutorial {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) // auto increment
    private long id;

    @Column(name = "title") // Column mapping
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {
    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
