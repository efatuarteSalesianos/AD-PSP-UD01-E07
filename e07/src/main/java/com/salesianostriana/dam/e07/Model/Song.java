package com.salesianostriana.dam.e07.Model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title, album, year;

    @ManyToOne
    private Artist artist;

    @Builder.Default
    @OneToMany(mappedBy = "song")
    private List<AddedTo> added = new ArrayList<>();
}
