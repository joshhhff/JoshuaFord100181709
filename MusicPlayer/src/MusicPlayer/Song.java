package MusicPlayer;

/**
 * SongPlayer.java
 *
 * This file contains the playlist class
 * Other Files: Main.java
 *
 * @author Joshua Ford
 * Date: November 10, 2023
 */

public class Song {
    private String songName;
    private String artistName;
    private int playCount;

    public Song(String artistName, String songName, int playCount){
        this.artistName = artistName;
        this.songName = songName;
        this.playCount = playCount;
    }

    public String getArtistName(){
        return artistName;
    }

    public String getSongName(){
        return songName;
    }

    public int getPlayCount(){
        return playCount;
    }

    public void setPlayCount(){
        playCount++;
    }

    public String toString(){
        return artistName + " | " + songName + " | " + "(Number of plays: " + playCount + ")";
    }
}
