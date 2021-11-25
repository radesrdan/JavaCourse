package com.udemy.InnerClassChallenge;

public class Song {
    private String title;
    private Double duration;

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "title= " + this.title + ", duration= " + this.duration;
    }
}
