package com.replcodes;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist){
        this.title=title;
        this.artist=artist;
    }

    private String play(String title){
        return title;
    }

    public void titleAndArtist(){
        System.out.println(play("title")+artist);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
