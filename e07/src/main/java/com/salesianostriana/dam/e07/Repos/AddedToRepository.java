package com.salesianostriana.dam.e07.Repos;

import com.salesianostriana.dam.e07.Model.AddedTo;
import com.salesianostriana.dam.e07.Model.SongToPlaylistPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, SongToPlaylistPK> {
}
