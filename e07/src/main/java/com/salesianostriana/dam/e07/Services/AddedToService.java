package com.salesianostriana.dam.e07.Services;

import com.salesianostriana.dam.e07.Model.AddedTo;
import com.salesianostriana.dam.e07.Model.Playlist;
import com.salesianostriana.dam.e07.Model.Song;
import com.salesianostriana.dam.e07.Model.SongToPlaylistPK;
import com.salesianostriana.dam.e07.Repos.AddedToRepository;
import com.salesianostriana.dam.e07.Services.Base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo, SongToPlaylistPK, AddedToRepository> {

    public Song addSongToPlaylist(Song s, Playlist p) {

        // 1. Crear una nueva instancia de AddedTo por cada Song
        // 2. Insertarlas en la base de datos.

        AddedTo a = AddedTo.builder()
                .song(s)
                .playlist(p)
                .build();
        save(a);

        return s;
    }
}
