package com.salesianostriana.dam.e07.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Playlist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name, description;

    @Builder.Default
    @OneToMany(mappedBy = "playlist")
    private List<AddedTo> added = new ArrayList<>();
}
