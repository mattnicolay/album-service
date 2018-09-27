package com.example.albumservice;

import static org.mockito.Mockito.when;

import com.example.albumservice.controller.AlbumController;
import com.example.albumservice.model.Album;
import com.example.albumservice.service.AlbumService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AlbumServiceApplication.class)
@TestPropertySource("classpath:test-application.yml")
public class ContractBase {


  @MockBean
  private AlbumService albumService;
  @Autowired
  private AlbumController albumController;

  @Before
  public void setup() {
    RestAssuredMockMvc.standaloneSetup(albumController);

    Album aMoonShapedPool = new Album("A Moon Shaped Pool", "2016");
    aMoonShapedPool.setId(1L);

    Album scenery = new Album("Scenery", "1977");
    scenery.setId(2L);

    when(albumService.getAlbumsByArtistId(1L))
        .thenReturn(Arrays.asList(aMoonShapedPool));
    when(albumService.getAlbumsByArtistId(2L))
        .thenReturn(Arrays.asList(scenery));
  }

  @Test
  public void contextLoads() {

  }


}
