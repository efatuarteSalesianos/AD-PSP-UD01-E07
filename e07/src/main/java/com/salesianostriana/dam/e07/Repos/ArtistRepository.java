package com.salesianostriana.dam.e07.Repos;

import com.salesianostriana.dam.e07.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
