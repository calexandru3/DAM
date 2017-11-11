package com.example.davinci.proiect_android;

import android.media.Image;
import android.net.Uri;

/**
 * Created by davinci on 11/4/17.
 */

public class Domain {
    private int id;
    private String title;
    private String description;
    private int image;

    public Domain(int id, String title, String description, int image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}
