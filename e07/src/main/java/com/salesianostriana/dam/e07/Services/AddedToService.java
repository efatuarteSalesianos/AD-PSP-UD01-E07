package com.salesianostriana.dam.e07.Services;

import com.salesianostriana.dam.e07.Model.AddedTo;
import com.salesianostriana.dam.e07.Model.Playlist;
import com.salesianostriana.dam.e07.Model.Song;
import com.salesianostriana.dam.e07.Model.SongToPlaylistPK;
import com.salesianostriana.dam.e07.Repos.AddedToRepository;
import com.salesianostriana.dam.e07.Services.Base.BaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddedToService extends BaseService<AddedTo, SongToPlaylistPK, AddedToRepository> {

    public void addSongToPlaylist(Song s, Playlist p, SongService ss, PlaylistService ps) {

        // 1. Crear una nueva instancia de AddedTo por cada Song
        // 2. Insertarlas en la base de datos.

        AddedTo a = AddedTo.builder()
                .dateTime(LocalDateTime.now())
                .orden(this.findAll().size()+1)
                .build();
        a.addSongPlaylist(s, p);
        save(a);
        ss.edit(s);
        ps.edit(p);
    }
}
