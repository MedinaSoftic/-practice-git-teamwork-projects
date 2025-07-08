package org.example;

public class Movie {
    private String title;
    private int rating;
    private String description;

    public Movie(String title, int rating, String description){
        this.title=title;
        this.rating=rating;
        this.description=description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return("Movie Title: " + getTitle() + " Movie Rating: " + getRating() + " Description: " + getDescription());
    }
}
