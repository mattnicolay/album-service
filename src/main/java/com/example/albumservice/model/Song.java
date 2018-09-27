package com.example.albumservice.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String year;
  private String duration;

  public Song(String name, String year, String duration) {
    this.name = name;
    this.year = year;
    this.duration = duration;
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

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Song song = (Song) o;
    return id == song.id &&
        Objects.equals(name, song.name) &&
        Objects.equals(year, song.year) &&
        Objects.equals(duration, song.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, year, duration);
  }

  @Override
  public String toString() {
    return "Song{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", year='" + year + '\'' +
        ", duration='" + duration + '\'' +
        '}';
  }
}
