package coursework_ac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author amie's pc
 */

public class trackBST {

   private static class Node {
       Tracks tracks;
       Node left;
       Node right;
  
    /** 
     * @param item The data value stored in the new BTnode.
     * @param left The new node's left child.
     * @param right The new node's right child.
     */
       
       // create the nodes which are needed for the binary tree this has both of the child nodes needed
    public Node(Tracks tracks, Node left, Node right) {
      this.tracks = tracks;
      this.left = left;
      this.right = right;
    }
    /** 
     * @param item The piece of data value stored in the new node.
     */
    public Node(Tracks tracks) {
      this(tracks, null, null);
    }
  }

  private Node head;

  
  public trackBST() {
    head = null;
  }

/**
     * @param tracks
   * @param item The value to be inserted.
   */
  // this inserts the head node data 
  public void insert(Tracks tracks) {
    head = insertHelper(head, tracks);
  }

  /**
   
   * @param head The root of the tree to receive the items.
   * @param item The value to be inserted.
   */
  private static Node insertHelper(Node head, Tracks tracks) {
    if (head == null) {
      return new Node(tracks);
    }
    else if (head.tracks.getArtist().compareToIgnoreCase(tracks.getArtist())>0) {
      head.left = insertHelper(head.left, tracks);
      return head;
    }
    else {
      head.right = insertHelper(head.right, tracks);
      return head;
    }
  }

            public void print(String Function){
                Print(head,"",Function);
            }

            private static void Print(Node head,String temp,String Function) {
                if (head == null) {
                    return;
                }
                //here we print the artist names in ascending method by using the forward method 
                // this uses the left child as this shows the correct data
                if (Function=="Forward") {
                    Print(head.left,"","Forward");
                    System.out.println(head.tracks.toString());
                    
                    Print(head.right,"","Forward");
                }
                // here the function is changed to show the artist names in decending order 
                // this uses the right child to show the correct data
                else if (Function== "Reverse"){
                    Print(head.right,"","Reverse");
                    System.out.println(head.tracks.toString());
                    Print(head.left,"","Reverse");
                }
                else if (Function== "Artist"){
                    try{
                        //check if the artist has made more than one song on the list
                        Print(head.left, temp, "Artist");
                        if(!head.tracks.getArtist().equals(temp)){
                            temp = head.tracks.getArtist();
                            System.out.println(temp);
                        }
                    }
                    catch(NullPointerException E){
                        temp = head.tracks.getArtist();
                        System.out.println(temp);
                    }
                    Print(head.right, temp,"Artist");
                }
                }
            //this method is placed within a try catch incase the file cannot be found then an exception can be thrown
       public static trackBST loadData() throws FileNotFoundException, IOException{
       
           trackBST trackList = new trackBST();

        BufferedReader read = new BufferedReader(new FileReader("/Users/amie's pc/OneDrive/Desktop/DSA Coursework/coursework_AC/src/coursework_ac/testBST.txt"));

        String line = null;
        while ((line = read.readLine()) != null)
        {
            // this breaks up the file that has been read in which makes it readable to the progam 
            String[] lineList = line.split(",");
            int trackID = Integer.parseInt(lineList[0]);
            String TrackTitle = lineList[1];
            String Artist = lineList[2];
            double TrackLength = Double.parseDouble(lineList[3]);
            String Composer = lineList[4];
            int ReleaseDate = Integer.parseInt(lineList[5]);
            String Album = lineList[6];
            String Genre = lineList[7];
            Tracks newTracks = new Tracks(trackID,TrackTitle,Artist,TrackLength,Composer,ReleaseDate,Album,Genre);
            trackList.insert(newTracks);
            
        }
        //this returns the list of the tracks that have been read in 
        return trackList;
       }
    }
    



    


