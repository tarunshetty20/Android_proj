package com.example.tarun.final_proj.model;

/**
 * Created by tarun on 24-04-2018.
 */

public class Anime {

    private String name , Description, rating , episode,categories, studio, image_url;

    public Anime() {
    }

    public Anime(String name, String description, String rating, String episode, String categories, String studio, String image_url) {
        this.name = name;
        Description = description;
        this.rating = rating;
        this.episode = episode;
        this.categories = categories;
        this.studio = studio;
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public String getRating() {
        return rating;
    }

    public String getEpisode() {
        return episode;
    }

    public String getCategories() {
        return categories;
    }

    public String getStudio() {
        return studio;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
