package com.huwei.sweetmusicplayer.models;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ARTIST_INFO.
 */
public class ArtistInfo {

    private Long artistId;
    private String artist;

    public ArtistInfo() {
    }

    public ArtistInfo(Long artistId) {
        this.artistId = artistId;
    }

    public ArtistInfo(Long artistId, String artist) {
        this.artistId = artistId;
        this.artist = artist;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}