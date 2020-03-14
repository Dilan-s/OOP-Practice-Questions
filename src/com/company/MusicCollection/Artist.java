package com.company.MusicCollection;

import java.util.ArrayList;
import java.util.List;

public class Artist implements ArtistInterface {

  private String name;
  private List<Record> catalogue;
  private Genre mainGenre;

  public Artist(String name, Genre mainGenre) {
    this.name = name;
    this.mainGenre = mainGenre;
    catalogue = new ArrayList<>();
  }

  @Override
  public void addRecord(String name) {
    addRecord(name, mainGenre);
  }

  @Override
  public void addRecord(String name, Genre genre) {
    Record record = new Record(name, genre);
    catalogue.add(record);
  }

  @Override
  public void showCatalogue() {
    System.out.println(catalogue);
  }

  @Override
  public void showGenre(Genre genre) {
    List<Record> genreList = new ArrayList<>();
    for (Record r : catalogue) {
      if (r.getGenre() == genre) {
        genreList.add(r);
      }
    }
    System.out.println(genreList);
  }

  public String getName() {
    return name;
  }
}
