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
public class TesttrackList {
    public static void main(String[] args) throws Exception{
 

         int choice = -1;
         // makes sure that no numbers outwith the options are chosen 
        while(choice != 9){

            //scanner takes in the users choice 
        Scanner scanner5 = new Scanner(System.in);
        System.out.println(" \n 1. Add A Track  \n 2. Search Track By Song Name  \n 3. Search Track By Artist  \n 4. Display Tracks by Genre \n 5. Display All Tracks \n 6. Display All ascending order \n 7. Display All decending Order \n 8. Display All Artists \n 9. Exit \n");
        choice = scanner5.nextInt();

        trackList TL = new trackList();
        //test harness/ what is used to test that the display methods work 
        Tracks track1 = new Tracks(0, "Weird", "Yungblud", 3.04,"Yungblud", 2020, "WEIRD", "Rock");
        Tracks track2 = new Tracks(1, "Hello", "Adele", 4.04,"Adele", 2015, "Album1", "Pop");
        Tracks track3 = new Tracks(2, "All Star", "Smash Mouth", 2.55, "Smash Mouth", 1999, "Album2", "Pop");
        Tracks track4 = new Tracks(3, "Lithium", "Nirvana", 2.43, "Kurt Cobain", 1993, "Nevermind", "Grunge");
        Tracks track5 = new Tracks(4, "Monkey Wrench", "Foo Fighters", 4.55, "Dave Grohl", 1999, "Color And the Shape", "Rock");
        Tracks track6 = new Tracks(5, "Best of You", "Foo Fighters", 2.45,"Dave Grohl", 2005, "Foos Album", "Rock");
        //adds the tracks
        TL.add(track1);
        TL.add(track2);
        TL.add(track3);
        TL.add(track4);
        TL.add(track5);
        TL.add(track6);
        trackBST TBST = new trackBST();
        //performs a specific task chosen by the user
     switch(choice){
        case 1:

           break;
        case 2:          
            TL.displayTrack(TL.searchTrack());
           break;
        case 3:
            TL.displayTrack(TL.searchArtist());
           break;
        case 4:
            TL.displayTrackbyGenre();
            break;
        case 5:
            TL.displayAllTracks();
            break;
        case 6:
            TBST = TBST.loadData();
            TBST.print("Forward");
            break;
        case 7:
            TBST = TBST.loadData();
            TBST.print("Reverse");
            break;
        case 8:
            
            TBST = TBST.loadData();
            TBST.print("Artist");
            break;
        case 9:
            System.out.println("Please select an option: ");
            break;
    }
   
}}
    
    }