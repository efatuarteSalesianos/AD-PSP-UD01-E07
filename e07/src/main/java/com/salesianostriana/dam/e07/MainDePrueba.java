package com.salesianostriana.dam.e07;

import com.salesianostriana.dam.e07.Model.Artist;
import com.salesianostriana.dam.e07.Model.Song;
import com.salesianostriana.dam.e07.Services.AddedToService;
import com.salesianostriana.dam.e07.Services.ArtistService;
import com.salesianostriana.dam.e07.Services.PlaylistService;
import com.salesianostriana.dam.e07.Services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void initData() {

        List<Artist> artists = List.of(
                Artist.builder()
                        .name("The Weeknd")
                        .build(),
                Artist.builder()
                        .name("Artic Monkeys")
                        .build()
        );
        artistService.saveAll(artists);

        List<Song> songs = List.of(
                Song.builder()
                        .title("Blinding Lights")
                        .album("After hours")
                        .year("2020")
                        .build(),
                Song.builder()
                        .title("Do I Wanna Know?")
                        .album("After hours")
                        .year("2020")
                        .build(),
                Song.builder()
                        .title("Blinding Lights")
                        .album("After hours")
                        .year("2020")
                        .build()
        );
        songService.saveAll(songs);


    }

}
