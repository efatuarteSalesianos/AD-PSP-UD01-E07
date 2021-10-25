package com.salesianostriana.dam.e07.Services;

import com.salesianostriana.dam.e07.Model.Song;
import com.salesianostriana.dam.e07.Repos.SongRepository;
import com.salesianostriana.dam.e07.Services.Base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
