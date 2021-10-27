package com.salesianostriana.dam.e07;

import com.salesianostriana.dam.e07.Model.Artist;
import com.salesianostriana.dam.e07.Model.Playlist;
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

        Artist a1 = Artist.builder()
                        .name("The Weeknd")
                        .build();
        Artist a2 = Artist.builder()
                        .name("Artic Monkeys")
                        .build();

        artistService.save(a1);
        artistService.save(a2);

        Song s1 = Song.builder()
                        .title("Blinding Lights")
                        .album("After hours")
                        .year("2020")
                        .build();
        Song s2 = Song.builder()
                        .title("Do I Wanna Know?")
                        .album("AM")
                        .year("2019")
                        .build();

        s1.setArtist(a1);
        songService.save(s1);
        s2.setArtist(a2);
        songService.save(s2);

        songService.findAll()
                .forEach( s -> System.out.printf("Titulo: %s, Album: %s,  Anyo: %s, Artista: %s\n", s.getTitle(), s.getAlbum(), s.getYear(), s.getArtist().getName()));

        Playlist p1 = Playlist.builder()
                .name("Chilling")
                .description("Musica de relax para estudiar PSP")
                .build();
        Playlist p2 = Playlist.builder()
                .name("PSP")
                .description("Musica para escuchar en PSP")
                .build();

        playlistService.save(p1);

        addedToService.addSongToPlaylist(s1, p1, songService, playlistService);
        addedToService.addSongToPlaylist(s2, p1, songService, playlistService);
        addedToService.addSongToPlaylist(s1, p2, songService, playlistService);

    }

}
