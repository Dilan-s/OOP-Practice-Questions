package com.company.MusicCollection;

public class Record {

  private String title;
  private Genre genre;

  public Record(String title, Genre genre) {
    this.title = title;
    this.genre = genre;
  }

  public Genre getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return title + " - " + genre;
  }
}
