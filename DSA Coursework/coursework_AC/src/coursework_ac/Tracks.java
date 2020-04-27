/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_ac;

import java.util.Date;

/**
 *
 * @author amie's pc
 */

public class Tracks {
       // here i initialise the vairables needed 
    private int trackID;
    private String TrackTitle;
    private String Artist;
    private double TrackLength;
    private String Composer;
    private int ReleaseDate;
    private String Album;
    private String Genre;

    public Tracks(int trackID, String TrackTitle, String Artist, double TrackLength, String Composer, int ReleaseDate, String Album, String Genre){
        setTrackID(trackID);
        setTrackTitle(TrackTitle);
        setArtist(Artist);
        setTrackLength(TrackLength);
        setComposer(Composer);
        setReleaseDate(ReleaseDate);
        setAlbum(Album);
        setGenre(Genre);
    }
    // this is all the getters and setters needed 
    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public String getTrackTitle() {
        return TrackTitle;
    }

    public void setTrackTitle(String TrackTitle) {
        this.TrackTitle = TrackTitle;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public double getTrackLength() {
        return TrackLength;
    }

    public void setTrackLength(double TrackLength) {
        this.TrackLength = TrackLength;
    }

    public String getComposer() {
        return Composer;
    }

    public void setComposer(String Composer) {
        this.Composer = Composer;
    }

    public int getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(int ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    @Override
    public String toString() {
        return "Tracks{" + "trackID=" + trackID + ", TrackTitle=" + TrackTitle + ", Artist=" + Artist + ", TrackLength=" + TrackLength + ", Composer=" + Composer + ", ReleaseDate=" + ReleaseDate + ", Album=" + Album + ", Genre=" + Genre + '}';
    }

 
 
    
    
}

