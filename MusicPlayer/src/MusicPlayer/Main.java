package MusicPlayer;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void printAllSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public void printSongsOverPlays(int playCount) {
        for (Song song : songs) {
            if (song.getPlayCount() > playCount) {
                System.out.println(song);
            }
        }
    }

    public static void main(String[] args) {
        Main musicPlayer = new Main();
        Scanner in = new Scanner(System.in);

        //Add 10 prefixed songs to playlist

        Song song1 = new Song("The Beatles", "Hey Jude", 5000000);
        Song song2 = new Song("Queen", "Bohemian Rhapsody", 6000000);
        Song song3 = new Song("Michael Jackson", "Thriller", 7000000);
        Song song4 = new Song("Led Zeppelin", "Stairway to Heaven", 4500000);
        Song song5 = new Song("Pink Floyd", "Comfortably Numb", 4000000);
        Song song6 = new Song("Elton John", "Rocket Man", 3500000);
        Song song7 = new Song("Bob Marley", "No Woman, No Cry", 3000000);
        Song song8 = new Song("Adele", "Rolling in the Deep", 5500000);
        Song song9 = new Song("U2", "With or Without You", 4800000);
        Song song10 = new Song("Ed Sheeran", "Shape of You", 7000000);

        musicPlayer.addSong(song1);
        musicPlayer.addSong(song2);
        musicPlayer.addSong(song3);
        musicPlayer.addSong(song4);
        musicPlayer.addSong(song5);
        musicPlayer.addSong(song6);
        musicPlayer.addSong(song7);
        musicPlayer.addSong(song8);
        musicPlayer.addSong(song9);
        musicPlayer.addSong(song10);


        //Print menu for user
        while (true) {
            System.out.println("\nMusic Player Menu:");
            System.out.println("1. Add a Song");
            System.out.println("2. Remove a Song");
            System.out.println("3. Print All Songs");
            System.out.println("4. Print Songs with More than a Certain Number of Plays");
            System.out.println("5. Exit");


            //user input - also validates data type
            int choice;
            while (true) {
                System.out.println("Select an option:");
                if (!in.hasNextInt()) { // If the next input from the Scanner object "in" is not an integer
                    System.out.println("Error: Enter a number");
                    in.next();  // Discard last input and try again
                } else {
                    choice = in.nextInt();
                    break;
                }
            }

            //different options for the user to select
            switch (choice) {
                case 1:
                    in.nextLine();
                    System.out.println("Enter the artist's name: ");
                    String artistName = in.nextLine();

                    System.out.println("Enter the song title: ");
                    String songName = in.nextLine();

                    int plyCount = 0;

                    while (true) {
                        System.out.println("Enter the play count: ");
                        if (!in.hasNextInt()) {
                            System.out.println("Error: Enter a number");
                            in.nextLine(); //consumes invalid input
                        } else {
                            plyCount = in.nextInt();
                            break;
                        }
                    }

                    //adds user provided data to array
                    System.out.println(songName + " by " + artistName +  " Playcount: " + plyCount + " | has been added to the playlist.");
                    Song newSong = new Song(artistName, songName, plyCount);
                    musicPlayer.addSong(newSong);
                    break;

                case 2:
                    while (true){
                        int songIndex = 0;

                        if (musicPlayer.songs.isEmpty()) {
                            System.out.println("No songs to remove.");
                        } else {
                            in.nextLine();
                            System.out.println("Select a song to remove:");
                            for (int i = 0; i < musicPlayer.songs.size(); i++) {
                                System.out.println((i + 1) + ". " + musicPlayer.songs.get(i));
                            }
                            while (true) {
                                System.out.println("Enter the number of the song you want to remove: ");
                                if (!in.hasNextInt()) {
                                    System.out.println("Error: Enter a number");
                                    in.nextLine(); //consumes invalid input
                                } else {
                                    songIndex = in.nextInt();
                                    break;
                                }
                            }

                            if (songIndex >= 1 && songIndex <= musicPlayer.songs.size()) {
                                musicPlayer.removeSong(musicPlayer.songs.get(songIndex - 1));
                                System.out.println("Song removed.");
                                break;
                            } else {
                                System.out.println("Invalid selection.\n");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nAll Songs:");
                    musicPlayer.printAllSongs();
                    break;

                case 4:
                    System.out.println("Enter the minimum play count: ");
                    int playCount = in.nextInt();
                    in.nextLine(); //consumes the newline character

                    System.out.println("\nSongs with more than " + playCount + " play(s):");
                    musicPlayer.printSongsOverPlays(playCount);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    in.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}
