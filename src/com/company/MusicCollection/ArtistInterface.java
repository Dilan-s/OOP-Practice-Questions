package com.company.MusicCollection;

public interface ArtistInterface {

  void addRecord(String name);

  void addRecord(String name, Genre genre);

  void showCatalogue();

  void showGenre(Genre genre);

}
