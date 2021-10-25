package com.salesianostriana.dam.e07.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private SongToPlaylistPK id = new SongToPlaylistPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private String dateTime;
    private String order;

    /* MÉTODOS HELPERS */

    public void addToSong(Song s) {
        song = s;
        s.getAdded().add(this);
    }

    public void removeFromSong(Song s) {
        s.getAdded().remove(this);
        song = null;
    }

    public void addToPlaylist(Playlist p) {
        playlist = p;
        p.getAdded().add(this);
    }

    public void removeFromPlaylist(Playlist p) {
        p.getAdded().remove(this);
        playlist = null;
    }

}
