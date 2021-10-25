package com.salesianostriana.dam.e07.Services;

import com.salesianostriana.dam.e07.Model.Playlist;
import com.salesianostriana.dam.e07.Repos.PlaylistRepository;
import com.salesianostriana.dam.e07.Services.Base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlaylistRepository> {
}
