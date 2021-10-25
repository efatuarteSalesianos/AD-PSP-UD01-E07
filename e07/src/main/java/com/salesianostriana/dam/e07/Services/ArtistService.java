package com.salesianostriana.dam.e07.Services;

import com.salesianostriana.dam.e07.Model.Artist;
import com.salesianostriana.dam.e07.Repos.ArtistRepository;
import com.salesianostriana.dam.e07.Services.Base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
