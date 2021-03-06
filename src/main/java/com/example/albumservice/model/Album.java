package com.example.albumservice.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String year;

  public Album(String name, String year) {
    this.name = name;
    this.year = year;
  }

  public Album() {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Album album = (Album) o;
    return id == album.id &&
        Objects.equals(name, album.name) &&
        Objects.equals(year, album.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, year);
  }

  @Override
  public String toString() {
    return "Album{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", year='" + year + '\'' +
        '}';
  }
}
