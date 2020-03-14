package com.company.MusicCollection;

public enum Genre {

  ROCK("Rock"),
  POP("Pop"),
  JAZZ("Jazz");

  private String genre;

  Genre(String genre){
    this.genre = genre;
  }

  @Override
  public String toString() {
    return genre;
  }
}
