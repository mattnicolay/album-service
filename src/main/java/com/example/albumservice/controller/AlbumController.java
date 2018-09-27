package com.example.albumservice.controller;

import com.example.albumservice.model.Album;
import com.example.albumservice.service.AlbumService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/albums")
public class AlbumController {

  private AlbumService albumService;

  public AlbumController(AlbumService albumService) {
    this.albumService = albumService;
  }

  @GetMapping
  public List<Album> getAlbums(@RequestParam(value = "artistId", required = false) Long artistId) {
    return albumService.getAlbumsByArtistId(artistId);
  }

}
