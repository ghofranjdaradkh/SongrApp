package com.ghofranjdaradkh.songer.models;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Album {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

   long id ;

  String title;
String artist;
int songCount;

int length;
  String  imageUrl;


    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Song> songs;



    public Album( String title, String artist, int songCount, int length, String imageUrl) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
        this.songs = songs;
    }
}
