package MusicPlayer;

public class Song {
    private String songName;
    private String artistName;
    private int playCount;

    public Song(String artistName, String songName){
        this.artistName = artistName;
        this.songName = songName;
        this.playCount = 0;
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
