/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_ac;

import java.util.Scanner;




/**
 *
 * @author amie's pc
 */
public class trackList implements IADTtrackList{
    
    private Node head; 
    
    private class Node{
        Tracks tracks;
        Node next; 
        
        
        Node(Tracks tracks){
            this.tracks = tracks; 
            this.next = null; 
        }
    }
    
    trackList()
    {
        head = null;    
    }
// all of the methods must overrid the ones made within the IADTtrackList interface 
    @Override
    public void add(Tracks tracks){
  
        Node node = new Node(tracks);
        if (head == null) {
            head = node;
        } else {
            Node currNode = this.head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = node;
        }
        }
// this is used to serach the tracks for a specific title 
    @Override
        public Tracks searchTrack(){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please Enter Track Name ");
            String Search = scanner1.next();
            Node node = this.head;    
            while(node !=null){
                if (node.tracks.getTrackTitle().contains(Search)) {
                  
                    return node.tracks;
                }
                node = node.next;
            
    }
                System.out.println("Track itle Not Found");
                return null;
        }
   // here we search for a spefic artist and one of their tracks
        // the scanner is used to take the users answer which 
        //then is used to search the data and provide the correct answer
   @Override
        public Tracks searchArtist(){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please Enter Track Artist ");
            String searchArtist = scanner2.next();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please Enter Track Name ");
            String searchTrack = scanner3.next();
            Node node = this.head;    
            while(node !=null){
                if (node.tracks.getArtist().contains(searchArtist)&&node.tracks.getTrackTitle().contains(searchTrack)) { 
                    return node.tracks;
                }
                node = node.next;     
    }
     System.out.println("Track Artist Not Found");
     return null;
    }
        //this displays a specific track
   @Override 
        public void displayTrack(Tracks tracks){
            System.out.println(tracks.toString());
   
   }
        //this takes in the users data and searches for a sepcific track genre 
   @Override 
         public void displayTrackbyGenre(){
               
         Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please Enter Track Genre ");
            String trackGenre = scanner4.next();
            Node node = this.head;    
            while(node !=null){
                if (node.tracks.getGenre().contains(trackGenre)) {
                   System.out.println(node.tracks.toString());
                }
                node = node.next;
            
    }
}
         // this displaty all of the track data 
   @Override
        public void displayAllTracks(){
            Node node = this.head;
            while(node != null){
                Node currNode = node; 
                System.out.println(node.tracks.toString());
                node = node.next;
            }
       
   }
}

    

