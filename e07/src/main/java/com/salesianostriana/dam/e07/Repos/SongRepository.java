package com.salesianostriana.dam.e07.Repos;

import com.salesianostriana.dam.e07.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
