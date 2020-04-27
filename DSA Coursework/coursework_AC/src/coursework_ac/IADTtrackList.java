/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_ac;

/**
 *
 * @author amie's pc
 */
// this creates the interface for which the methods can run from
public interface IADTtrackList {
    
    public void add (Tracks tracks);
    public Tracks searchTrack();
    public Tracks searchArtist();
    public void displayTrack (Tracks tracks);
    public void displayTrackbyGenre();
    public void displayAllTracks();
}
