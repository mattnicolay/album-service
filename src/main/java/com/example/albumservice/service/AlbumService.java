package com.example.albumservice.service;

import com.example.albumservice.model.Album;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {

  public List<Album> getAlbumsByArtistId(long artistId) {
    return new ArrayList<>();
  }
}
